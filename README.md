# my-actor-recover-sample

https://www.qoosky.io/techs/e0f555bc87#アクターの検索

```sh
[info] Running com.example.Hello 
[INFO] [09/22/2016 15:48:48.477] [mySystem-akka.actor.default-dispatcher-3] [akka://mySystem/user/myActor/myChild] preStart
[INFO] [09/22/2016 15:48:48.478] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor] preStart
[ERROR] [09/22/2016 15:48:49.506] [mySystem-akka.actor.default-dispatcher-6] [akka://mySystem/user/myActor] null
java.lang.Exception
	at com.example.MyActor$$anonfun$receive$1.applyOrElse(MyActor.scala:40)
	at akka.actor.Actor$class.aroundReceive(Actor.scala:480)
	at com.example.MyActor.aroundReceive(MyActor.scala:6)
	at akka.actor.ActorCell.receiveMessage(ActorCell.scala:526)
	at akka.actor.ActorCell.invoke(ActorCell.scala:495)
	at akka.dispatch.Mailbox.processMailbox(Mailbox.scala:257)
	at akka.dispatch.Mailbox.run(Mailbox.scala:224)
	at akka.dispatch.Mailbox.exec(Mailbox.scala:234)
	at scala.concurrent.forkjoin.ForkJoinTask.doExec(ForkJoinTask.java:260)
	at scala.concurrent.forkjoin.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1339)
	at scala.concurrent.forkjoin.ForkJoinPool.runWorker(ForkJoinPool.java:1979)
	at scala.concurrent.forkjoin.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:107)

[INFO] [09/22/2016 15:48:49.507] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor] preRestart
[INFO] [09/22/2016 15:48:49.509] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor] last message was: Some(crash)
[INFO] [09/22/2016 15:48:49.524] [mySystem-akka.actor.default-dispatcher-2] [akka://mySystem/user/myActor/myChild] postStop
[INFO] [09/22/2016 15:48:49.529] [mySystem-akka.actor.default-dispatcher-6] [akka://mySystem/user/myActor/myChild] preStart
[INFO] [09/22/2016 15:48:49.532] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor] postRestart
[INFO] [09/22/2016 15:48:50.477] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor] hi
[INFO] [09/22/2016 15:48:50.478] [mySystem-akka.actor.default-dispatcher-2] [akka://mySystem/user/myActor/myChild] hi
[INFO] [09/22/2016 15:48:51.477] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor] hi
[INFO] [09/22/2016 15:48:51.477] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor/myChild] hi
[INFO] [09/22/2016 15:48:52.477] [mySystem-akka.actor.default-dispatcher-5] [akka://mySystem/user/myActor] hi
[INFO] [09/22/2016 15:48:52.477] [mySystem-akka.actor.default-dispatcher-2] [akka://mySystem/user/myActor/myChild] hi
[INFO] [09/22/2016 15:48:52.478] [mySystem-akka.actor.default-dispatcher-6] [akka://mySystem/user/myActor/myChild] postStop
[INFO] [09/22/2016 15:48:52.479] [mySystem-akka.actor.default-dispatcher-6] [akka://mySystem/user/myActor] postStop
[success] Total time: 9 s, completed 2016/09/22 15:48:52
```
