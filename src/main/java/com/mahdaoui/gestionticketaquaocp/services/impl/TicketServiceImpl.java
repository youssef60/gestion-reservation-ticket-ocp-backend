package com.mahdaoui.gestionticketaquaocp.services.impl;

import com.mahdaoui.gestionticketaquaocp.exceptions.EntityNotFoundException;
import com.mahdaoui.gestionticketaquaocp.exceptions.ErrorCodes;
import com.mahdaoui.gestionticketaquaocp.exceptions.InvalidEntityException;
import com.mahdaoui.gestionticketaquaocp.models.Ticket;
import com.mahdaoui.gestionticketaquaocp.repositories.TicketRepository;
import com.mahdaoui.gestionticketaquaocp.services.TicketService;
import com.mahdaoui.gestionticketaquaocp.validators.TicketValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public List<Ticket> findAllByMatricule(String matricule) {
        if(!StringUtils.hasLength(matricule)){
            throw new EntityNotFoundException("le matricule n'est pas valide");
        }
        return ticketRepository.findAllByMatricule(matricule).orElseThrow(
                () -> new EntityNotFoundException("cette matricule n'existe pas", ErrorCodes.TICKET_NOT_FOUND)
        );
    }

    @Override
    public Ticket save(Ticket ticket) {
        List<String> errors = TicketValidator.TicketValidate(ticket);
        if(!errors.isEmpty()){
            throw new InvalidEntityException("le ticket est invalide ", ErrorCodes.TICKET_NOT_VALID,errors);

        }
        return ticketRepository.save(ticket);
    }

    @Override
    public void deleteById(Long id) {
        if(id == null){
            throw new EntityNotFoundException("l'id est nulle");
        }
        ticketRepository.deleteById(id);
    }

    @Override
    public Ticket findById(Long id) {
        if(id == null){
            throw new EntityNotFoundException("l'id est nulle");
        }

        return ticketRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("l'id n'existe pas ",ErrorCodes.COLLABORATEUR_NOT_FOUND  ) );
    }

    @Override
    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }
}
