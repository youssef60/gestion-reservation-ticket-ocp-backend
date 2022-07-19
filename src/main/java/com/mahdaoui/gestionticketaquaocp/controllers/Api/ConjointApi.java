package com.mahdaoui.gestionticketaquaocp.controllers.Api;

import com.mahdaoui.gestionticketaquaocp.models.Conjoint;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api")
public interface ConjointApi {

    @PostMapping("/conjoints")
    public ResponseEntity<Conjoint> save(@RequestBody Conjoint conjoint);

    @DeleteMapping("/conjoints/{id}")
    public void  deleteById(@PathVariable Long id);

    @GetMapping("/conjoints/{matricule}")
    ResponseEntity<List<Conjoint>> findAllByMatricule(@PathVariable String matricule);

    @GetMapping("/conjoints")
    public ResponseEntity<List<Conjoint>> findAll();

}
