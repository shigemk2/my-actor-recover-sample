package com.example

import akka.actor.{Actor, Props}
import akka.event.Logging

class MyActor extends Actor {
  val log = Logging(context.system, this)

  // preStart -> preRestart -> postRestart/preStart -> postStop
  // [---- Old Instance ----] [-------- New Instance --------]
  // [---- Old Child -------] [-------- New Child -----------]
  // <---------------- Same MailBox ------------------------->

  // New Instance のコンストラクト時にも実行されます。
  val child = context.actorOf(Props[MyActor2], name = "myChild")

  override def preStart(): Unit = {
    log.info("preStart")
  }

  // これを定義しない場合は `preStart` の処理が実行されます。
  // (その際 `context.stop(child)` は実行されます)
  override def preRestart(reason: Throwable, message: Option[Any]): Unit = {
    log.info("preRestart")
    if (message.nonEmpty)
      log.info("last message was: %s" format message)
    context.stop(child) // stop しないと old child が残存し `myChild` で名前が重複するため例外が発生します。
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
