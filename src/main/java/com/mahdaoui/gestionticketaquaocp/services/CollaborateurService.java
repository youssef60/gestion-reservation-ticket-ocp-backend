package com.mahdaoui.gestionticketaquaocp.services;

import com.mahdaoui.gestionticketaquaocp.models.Collaborateur;

import java.util.List;

public interface CollaborateurService {



    public Collaborateur save(Collaborateur collaborateur);

    public void  deleteById(Long id);

    public Collaborateur findCollaborateurByMatricule(String matricule);

    public Collaborateur findById(Long id);

    public List<Collaborateur> findAll();


}
