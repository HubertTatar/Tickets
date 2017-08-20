package com.hutatar.tickets.api.routes

import akka.http.scaladsl.server.Directives._
import com.hutatar.tickets.ApplicationConf

trait Routes extends ApplicationConf with TicketRoutes {

  val logDuration = extractRequestContext.flatMap { ctx =>
    val start = System.currentTimeMillis()

    mapResponse { resp =>
      val d = System.currentTimeMillis() - start
      println(s"[${resp.status.intValue()}] ${ctx.request.method.name} ${ctx.request.uri} took: ${d}ms")
      resp
    }
  }

  val routes = (logDuration) {
    ticketRoutes
  }

}
