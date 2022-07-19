package com.mahdaoui.gestionticketaquaocp.controllers.Api;

import com.mahdaoui.gestionticketaquaocp.models.Enfant;
import com.mahdaoui.gestionticketaquaocp.models.Ticket;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public interface TicketApi {

    @GetMapping("/tickets/{matricule}")
    ResponseEntity<List<Ticket>> findAllByMatricule(String matricule);

    @PostMapping("/tickets")
    public ResponseEntity<Ticket> save(@RequestBody Ticket ticket);

    @DeleteMapping("/tickets/{id}")
    public void  deleteById(@PathVariable Long id);

    @GetMapping("/tickets/{id}")
    public ResponseEntity<Ticket> findById(@PathVariable Long id);

    @GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> findAll();
}
