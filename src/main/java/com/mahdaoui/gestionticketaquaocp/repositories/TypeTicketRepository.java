package com.mahdaoui.gestionticketaquaocp.repositories;

import com.mahdaoui.gestionticketaquaocp.models.TypeTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypeTicketRepository extends JpaRepository<TypeTicket, Long> {

    Optional<TypeTicket> findTypeTicketByType( String type );

    Optional<TypeTicket> findTypeTicketById(Long id);
}
