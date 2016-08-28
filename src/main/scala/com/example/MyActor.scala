package com.example

import akka.actor.{Actor, Props}
import akka.event.Logging

class MyActor extends Actor {
  val log = Logging(context.system, this)
  val child = context.actorOf(Props[MyActor2], name = "myChild")

  override def preStart(): Unit = {
    log.info("preStart")
  }

  override def preRestart(reason: Throwable, message: Option[Any]): Unit = {
    log.info("preRestart")
    if (message.nonEmpty)
      log.info("last message was: %s" format message)
    context.stop(child)
  }

  override def postRestart(reason: Throwable): Unit = {
    log.info("postRestart")
  }

  override def postStop(): Unit = {
    log.info("postStop")
  }

  def receive = {
    case "crash" => {
      throw new Exception
    }
    case s: String => {
      log.info(s)
      child ! s
    }
    case _ => {
    }
  }
}
