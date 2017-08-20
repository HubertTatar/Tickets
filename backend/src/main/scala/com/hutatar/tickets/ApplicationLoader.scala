package com.hutatar.tickets

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import com.hutatar.tickets.api.routes.Routes
import com.hutatar.tickets.service.TicketService

trait ApplicationLoader extends ApplicationConf {
  implicit lazy val system = ActorSystem("system")
  implicit lazy val materializer = ActorMaterializer()

  private val tService = new TicketService()

  lazy val routes = new Routes {
    override val ticketService = tService
  }
}
