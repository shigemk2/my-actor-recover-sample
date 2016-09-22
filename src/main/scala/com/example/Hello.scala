package com.example

import akka.actor.{ActorSystem, Props}

object Hello {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("mySystem")

    // アクターの生成
    val props = Props[MyActor]
    val actor = system.actorOf(props, name = "myActor")
    Thread.sleep(1000)

    // メッセージを送信
    actor ! "crash"

    for (i <- 1 to 3) {
      Thread.sleep(1000)
      // メッセージを送信
      actor ! "hi"
    }
    system.terminate
  }
}
