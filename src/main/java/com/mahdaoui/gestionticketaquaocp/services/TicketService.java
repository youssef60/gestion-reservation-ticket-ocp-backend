package com.mahdaoui.gestionticketaquaocp.services;

import com.mahdaoui.gestionticketaquaocp.models.Collaborateur;
import com.mahdaoui.gestionticketaquaocp.models.Conjoint;
import com.mahdaoui.gestionticketaquaocp.models.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {

    List<Ticket> findAllByMatricule(String matricule);

    public Ticket save(Ticket ticket);

    public void  deleteById(Long id);

    public Ticket findById(Long id);

    public List<Ticket> findAll();


}
