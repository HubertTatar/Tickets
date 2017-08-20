package com.hutatar.tickets.api.routes

import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.server.Directives._
import com.hutatar.tickets.api.routes.dto.JsonSupport
import com.hutatar.tickets.api.routes.dto.JsonSupport
import com.hutatar.tickets.service.TicketService

trait TicketRoutes extends JsonSupport {

  val ticketService: TicketService

  val ticketRoutes = pathPrefix("tickets") {
    pathEndOrSingleSlash {
      get {
        complete(OK, ticketService.listTasks())
      }
    }
  }
}
