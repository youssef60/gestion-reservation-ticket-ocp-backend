package com.mahdaoui.gestionticketaquaocp.services;

import com.mahdaoui.gestionticketaquaocp.models.Conjoint;
import com.mahdaoui.gestionticketaquaocp.models.Enfant;

import java.util.List;
import java.util.Optional;

public interface EnfantService {

    public Enfant save(Enfant enfant);

    public void  deleteById(Long id);


    List<Enfant> findAllByMatricule(String matricule);

    public List<Enfant> findAll();


}
