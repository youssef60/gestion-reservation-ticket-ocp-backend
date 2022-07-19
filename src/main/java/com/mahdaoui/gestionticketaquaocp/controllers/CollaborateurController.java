package com.mahdaoui.gestionticketaquaocp.controllers;

import com.mahdaoui.gestionticketaquaocp.controllers.Api.CollaborateurApi;
import com.mahdaoui.gestionticketaquaocp.models.Collaborateur;
import com.mahdaoui.gestionticketaquaocp.services.CollaborateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollaborateurController implements CollaborateurApi {

    @Autowired
    CollaborateurService collaborateurService;

    @Override
    public ResponseEntity<List<Collaborateur>> findAll() {
        return new  ResponseEntity<>(collaborateurService.findAll(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Collaborateur> save(Collaborateur collaborateur) {
        return new ResponseEntity<>(collaborateurService.save(collaborateur) , HttpStatus.CREATED );
    }

    @Override
    public void deleteById(Long id) {
        collaborateurService.deleteById(id);
    }

    @Override
    public ResponseEntity<Collaborateur> findCollaborateurByMatricule(String matricule) {
        return new  ResponseEntity<>(collaborateurService.findCollaborateurByMatricule(matricule),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Collaborateur> findById(Long id) {
        return new ResponseEntity<>(collaborateurService.findById(id),HttpStatus.OK);
    }
}
