package com.hutatar.tickets

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

trait ApplicationLoader {
  implicit lazy val system = ActorSystem("system")
  implicit lazy val materializer = ActorMaterializer()

  lazy val routes = new Routes {}
}
