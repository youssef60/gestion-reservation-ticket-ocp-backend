package com.mahdaoui.gestionticketaquaocp.controllers.Api;

import com.mahdaoui.gestionticketaquaocp.models.Conjoint;
import com.mahdaoui.gestionticketaquaocp.models.Enfant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
public interface EnfantApi {

    @PostMapping("/enfants")
    public ResponseEntity<Enfant> save(@RequestBody Enfant enfant);

    @DeleteMapping("/enfants/{id}")
    public void  deleteById(@PathVariable Long id);

    @GetMapping("/enfants/{matricule}")
    ResponseEntity<List<Enfant>> findAllByMatricule(String matricule);

    @GetMapping("/enfants")
    public ResponseEntity<List<Enfant>> findAll();

}
