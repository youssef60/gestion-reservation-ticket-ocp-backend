package com.mahdaoui.gestionticketaquaocp.services;

import com.mahdaoui.gestionticketaquaocp.models.Collaborateur;

import java.util.List;

public interface CollaborateurService {


    Collaborateur update(Collaborateur collaborateur);

    public Collaborateur save(Collaborateur collaborateur);

   public void deleteAll();

    public Collaborateur findCollaborateurByMatricule(String matricule);

    public Long countAllCollaborateurs();



    public List<Collaborateur> findAll();


}
