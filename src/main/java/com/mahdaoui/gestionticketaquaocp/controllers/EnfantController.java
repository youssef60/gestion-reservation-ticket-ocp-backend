package com.mahdaoui.gestionticketaquaocp.controllers;

import com.mahdaoui.gestionticketaquaocp.controllers.Api.EnfantApi;
import com.mahdaoui.gestionticketaquaocp.models.Conjoint;
import com.mahdaoui.gestionticketaquaocp.models.Enfant;
import com.mahdaoui.gestionticketaquaocp.services.EnfantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnfantController implements EnfantApi {

    @Autowired
    EnfantService enfantService;

    @Override
    public ResponseEntity<Enfant> save(Enfant enfant) {
        return new  ResponseEntity<>(enfantService.save(enfant), HttpStatus.CREATED);
    }

    @Override
    public void deleteById(Long id) {
        enfantService.deleteById(id);
    }

    @Override
    public ResponseEntity<List<Enfant>> findAllByMatricule(String matricule) {
        return new ResponseEntity<>(enfantService.findAllByMatricule(matricule),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Enfant>> findAll() {
        return new ResponseEntity<>(enfantService.findAll(),HttpStatus.OK);
    }
}
