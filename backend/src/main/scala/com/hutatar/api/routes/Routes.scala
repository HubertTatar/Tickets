package com.hutatar.api.routes

import akka.http.scaladsl.server.Directives._
import com.hutatar.tickets.ApplicationConf

trait Routes extends ApplicationConf {

  val logDuration = extractRequestContext.flatMap { ctx =>
    val start = System.currentTimeMillis()
    // handling rejections here so that we get proper status codes
    mapResponse { resp =>
      val d = System.currentTimeMillis() - start
      println(s"[${resp.status.intValue()}] ${ctx.request.method.name} ${ctx.request.uri} took: ${d}ms")
      resp
    }
  }

  val routes = (logDuration) {

  }

}
