package com.hutatar.tickets.service

import com.hutatar.tickets.api.routes.dto.TicketDtos.TicketDto


class TicketService {
  def listTasks(): List[TicketDto] = {
    List(TicketDto("first"), TicketDto("second"))
  }
}

