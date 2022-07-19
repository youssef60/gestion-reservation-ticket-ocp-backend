package com.mahdaoui.gestionticketaquaocp.controllers.Api;

import com.mahdaoui.gestionticketaquaocp.models.TypeTicket;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api")
public interface TypeTicketApi {

    @PostMapping("/typeTicket")
    public ResponseEntity<TypeTicket> save(@RequestBody TypeTicket typeTicket);

    @DeleteMapping("/typeTicket/{id}")
    public void  deleteById(@PathVariable Long id);

    @GetMapping("/typeTicket/type")
    public ResponseEntity<String> findTypeTicketByType(String type);

    @GetMapping("/typeTickets")
    public ResponseEntity<List<TypeTicket>> findAll();
}
