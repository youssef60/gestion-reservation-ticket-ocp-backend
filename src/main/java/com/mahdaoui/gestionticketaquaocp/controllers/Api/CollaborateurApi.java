package com.mahdaoui.gestionticketaquaocp.controllers.Api;

import com.mahdaoui.gestionticketaquaocp.models.Collaborateur;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/api")
public interface CollaborateurApi {

    @GetMapping(value = "/collaborateurs")
    public ResponseEntity<List<Collaborateur>> findAll();

    @PostMapping( value = "/collaborateurs")
    public ResponseEntity<Collaborateur> save(@RequestBody Collaborateur collaborateur);

    @DeleteMapping( value = "/collaborateurs/{id}")
    public void  deleteById(@PathVariable Long id);

    @GetMapping(value = "/collaborateurs/{matricule}")
    public ResponseEntity<Collaborateur> findCollaborateurByMatricule(@PathVariable String matricule);

    @GetMapping(value = "/collaborateurs/{id}")
    ResponseEntity<Collaborateur> findById(Long id);

}
