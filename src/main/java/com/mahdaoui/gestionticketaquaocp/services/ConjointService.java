package com.mahdaoui.gestionticketaquaocp.services;

import com.mahdaoui.gestionticketaquaocp.models.Collaborateur;
import com.mahdaoui.gestionticketaquaocp.models.Conjoint;

import java.util.List;
import java.util.Optional;

public interface ConjointService {

    public Conjoint save(Conjoint conjoint);

    public void  deleteById(Long id);

    List<Conjoint> findAllByMatricule(String matricule);

    public List<Conjoint> findAll();

}
