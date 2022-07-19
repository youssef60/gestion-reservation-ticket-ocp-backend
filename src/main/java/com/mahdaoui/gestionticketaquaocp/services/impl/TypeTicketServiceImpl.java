package com.mahdaoui.gestionticketaquaocp.services.impl;

import com.mahdaoui.gestionticketaquaocp.exceptions.EntityNotFoundException;
import com.mahdaoui.gestionticketaquaocp.exceptions.ErrorCodes;
import com.mahdaoui.gestionticketaquaocp.exceptions.InvalidEntityException;
import com.mahdaoui.gestionticketaquaocp.models.TypeTicket;
import com.mahdaoui.gestionticketaquaocp.repositories.TypeTicketRepository;
import com.mahdaoui.gestionticketaquaocp.services.TypeTicketService;
import com.mahdaoui.gestionticketaquaocp.validators.TypeTicketValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

@Service
public class TypeTicketServiceImpl implements TypeTicketService {

    @Autowired
    TypeTicketRepository typeTicketRepository;

    @Override
    public String findTypeTicketByType(String type) {
        if (!StringUtils.hasLength(type)) {
            throw new EntityNotFoundException("le type n'est pas valide");
        }

        return typeTicketRepository.findTypeTicketByType(type).orElseThrow(
                () -> new EntityNotFoundException("cette type n'existe pas", ErrorCodes.TYPETICKET_NOT_FOUND)
        );
    }

    @Override
    public List<TypeTicket> findAll() {
        return typeTicketRepository.findAll();
    }

    public TypeTicket save(TypeTicket typeTicket) {
        List<String> errors = TypeTicketValidator.TypeTicketValidate(typeTicket);
        if(!errors.isEmpty()){
            throw new InvalidEntityException("le type  est invalide ", ErrorCodes.TYPETICKET_NOT_VALID,errors);

        }
        return typeTicketRepository.save(typeTicket);
    }

        public void deleteById(Long id) {
        if(id == null){
            throw new EntityNotFoundException("l'id est nulle");
        }
        typeTicketRepository.deleteById(id);
    }
}
