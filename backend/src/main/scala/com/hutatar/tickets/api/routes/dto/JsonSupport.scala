package com.hutatar.tickets.api.routes.dto

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import com.hutatar.tickets.api.routes.dto.TicketDtos._
import com.hutatar.tickets.api.routes.dto.TicketDtos.TicketDto
import spray.json.DefaultJsonProtocol

trait JsonSupport extends TicketFormat

trait TicketFormat extends SprayJsonSupport with DefaultJsonProtocol {
  implicit lazy val ticketDtoFormat = jsonFormat1(TicketDto)
}

object TicketDtos {
  case class TicketDto(name: String)
}
