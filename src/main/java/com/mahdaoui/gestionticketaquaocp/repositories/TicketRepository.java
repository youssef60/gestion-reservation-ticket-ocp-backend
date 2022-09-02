package com.mahdaoui.gestionticketaquaocp.repositories;

import com.mahdaoui.gestionticketaquaocp.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {

   /* Optional<List<Ticket>> findAllByMatricule(String matricule);*/
}
