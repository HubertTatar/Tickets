package com.hutatar.tickets.api.routes

import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.testkit.ScalatestRouteTest
import com.hutatar.tickets.ApplicationConf
import com.hutatar.tickets.api.routes.dto.JsonSupport
import com.hutatar.tickets.service.TicketService
import org.scalatest.{BeforeAndAfterEach, Matchers, WordSpec}

class RoutesSpec extends WordSpec with Routes with Matchers with ScalatestRouteTest with JsonSupport with ApplicationConf with BeforeAndAfterEach {
  override val ticketService = new TicketService()

  "GET /tickets" should {
    "return list of tickets" in {
      Get("/tickets") ~> routes ~> check {
        status shouldBe StatusCodes.OK
      }
    }
  }

}
