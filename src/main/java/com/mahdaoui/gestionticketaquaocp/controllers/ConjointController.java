package com.mahdaoui.gestionticketaquaocp.controllers;

import com.mahdaoui.gestionticketaquaocp.controllers.Api.ConjointApi;
import com.mahdaoui.gestionticketaquaocp.models.Conjoint;
import com.mahdaoui.gestionticketaquaocp.services.ConjointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConjointController implements ConjointApi {

    @Autowired
    ConjointService conjointService;

    @Override
    public ResponseEntity<Conjoint> save(Conjoint conjoint) {
        return new  ResponseEntity<>(conjointService.save(conjoint), HttpStatus.CREATED);
    }

    @Override
    public void deleteById(Long id) {
         conjointService.deleteById(id);
    }

    @Override
    public void deleteAll() {
        this.conjointService.deleteAll();
    }


    @Override
    public ResponseEntity<List<Conjoint>> findAll() {
        return new ResponseEntity<>(conjointService.findAll(),HttpStatus.OK);
    }
}
