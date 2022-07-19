package com.mahdaoui.gestionticketaquaocp.controllers;

import com.mahdaoui.gestionticketaquaocp.controllers.Api.TypeTicketApi;
import com.mahdaoui.gestionticketaquaocp.models.TypeTicket;
import com.mahdaoui.gestionticketaquaocp.services.TypeTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TypeTicketController implements TypeTicketApi {

    @Autowired
    TypeTicketService typeTicketService;

    @Override
    public ResponseEntity<TypeTicket> save(TypeTicket typeTicket) {
        return new ResponseEntity<>(typeTicketService.save(typeTicket), HttpStatus.CREATED);
    }

    @Override
    public void deleteById(Long id) {
        typeTicketService.deleteById(id);
    }

    @Override
    public ResponseEntity<String> findTypeTicketByType(String type) {
        return new ResponseEntity<>(typeTicketService.findTypeTicketByType(type),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<TypeTicket>> findAll() {
        return new  ResponseEntity<>(typeTicketService.findAll(),HttpStatus.OK);
    }
}
