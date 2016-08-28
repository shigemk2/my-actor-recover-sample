package com.example

import akka.actor.Actor
import akka.event.Logging

class MyActor2 extends Actor {
  val log = Logging(context.system, this)

  override def preStart(): Unit = {
    log.info("preStart")
  }

  override def postStop(): Unit = {
    log.info("postStop")
  }

  def receive = {
    case s: String => {
      log.info(s)
    }
    case _ => {
    }
  }
}
