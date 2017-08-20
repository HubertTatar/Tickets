package com.hutatar.tickets

import akka.http.scaladsl.Http
import scala.concurrent.ExecutionContext.Implicits._

import scala.io.StdIn

object Main extends ApplicationLoader {
  def main(args: Array[String]): Unit = {
    val host = serverHost
    val port = serverPort

    val bindingFuture = Http().bindAndHandle(routes.routes, host, port)


    println(s"Server online at http://$host:$port/\nPress RETURN to stop...")
    StdIn.readLine()
    bindingFuture.flatMap(_.unbind()).onComplete(_ => system.terminate())
  }
}
