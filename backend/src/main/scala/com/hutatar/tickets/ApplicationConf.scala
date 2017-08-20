package com.hutatar.tickets

import com.typesafe.config.ConfigFactory

trait ApplicationConf {
  val config = ConfigFactory.defaultApplication()
  val serverHost = config.getString("server.host")
  val serverPort = config.getString("server.port")
}
