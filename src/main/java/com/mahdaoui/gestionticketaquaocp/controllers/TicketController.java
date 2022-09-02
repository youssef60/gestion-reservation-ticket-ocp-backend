package com.mahdaoui.gestionticketaquaocp.controllers;

import com.mahdaoui.gestionticketaquaocp.controllers.Api.TicketApi;
import com.mahdaoui.gestionticketaquaocp.models.Ticket;
import com.mahdaoui.gestionticketaquaocp.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TicketController implements TicketApi {

    @Autowired
    TicketService ticketService;

    /*@Override
    public ResponseEntity<List<Ticket>> findAllByMatricule(String matricule) {
        return new ResponseEntity<>(ticketService.findAllByMatricule(matricule) , HttpStatus.OK);
    }*/

    @Override
    public ResponseEntity<Ticket> save(Ticket ticket) {

        return new ResponseEntity<>(ticketService.save(ticket),HttpStatus.CREATED);

    }

    @Override
    public void deleteById(Long id) {
            ticketService.deleteById(id);
    }

    @Override
    public void deleteAll() {
        ticketService.deleteAll();
    }

    @Override
    public ResponseEntity<Ticket> findById(Long id) {
        return new ResponseEntity<>(ticketService.findById(id),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Ticket>> findAll() {
        return new ResponseEntity<>(ticketService.findAll(),HttpStatus.OK);
    }
}
