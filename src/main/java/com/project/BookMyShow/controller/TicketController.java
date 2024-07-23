package com.project.BookMyShow.controller;

import com.project.BookMyShow.dto.BookTicketRequestDTO;
import com.project.BookMyShow.model.Ticket;
import com.project.BookMyShow.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired     // creates dependency and Inject inside controller
    private TicketService ticketService;

    @PostMapping("/ticket")
    public ResponseEntity bookTicket(@RequestBody BookTicketRequestDTO bookTicketRequestDTO) throws Exception {
        //validate ticket request dto
        return ResponseEntity.ok(
                ticketService.bookTicket(bookTicketRequestDTO.getShowSeatIds(), bookTicketRequestDTO.getUserId())
        );
    }
//    @GetMapping("/hello")
//    public ResponseEntity greet(){
//        String greet = ticketService.greet();
//        return ResponseEntity.ok(greet);
//    }
}
