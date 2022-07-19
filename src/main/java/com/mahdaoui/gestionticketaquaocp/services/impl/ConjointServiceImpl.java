package com.mahdaoui.gestionticketaquaocp.services.impl;

import com.mahdaoui.gestionticketaquaocp.exceptions.EntityNotFoundException;
import com.mahdaoui.gestionticketaquaocp.exceptions.ErrorCodes;
import com.mahdaoui.gestionticketaquaocp.exceptions.InvalidEntityException;
import com.mahdaoui.gestionticketaquaocp.models.Conjoint;
import com.mahdaoui.gestionticketaquaocp.repositories.ConjointRepository;
import com.mahdaoui.gestionticketaquaocp.services.ConjointService;
import com.mahdaoui.gestionticketaquaocp.validators.ConjointValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class ConjointServiceImpl implements ConjointService {

    @Autowired
    ConjointRepository conjointRepository;

    @Override
    public Conjoint save(Conjoint conjoint) {
        List<String> errors = ConjointValidator.conjointValidate(conjoint);
        if(!errors.isEmpty()){
            throw new InvalidEntityException("la conjointe n'est pas valide", ErrorCodes.CONJOINT_NOT_VALID,errors);
        }
        //TODO : CHECK FOR THE COLLABORATEUR
        return conjointRepository.save(conjoint);
    }

    @Override
    public void deleteById(Long id) {
        if(id == null){
            throw new EntityNotFoundException("l'id est nulle");
        }
        conjointRepository.deleteById(id);
    }

    @Override
    public List<Conjoint> findAllByMatricule(String matricule) {
        if(!StringUtils.hasLength(matricule)){
            throw new EntityNotFoundException("le matricule n'est pas valide");
        }
        return conjointRepository.findAllByMatricule(matricule).
                orElseThrow( () -> new EntityNotFoundException("conjoint avec le matricule " +matricule+ " n'existe pas"
                , ErrorCodes.CONJOINT_NOT_FOUND) );
    }

    @Override
    public List<Conjoint> findAll() {
        return conjointRepository.findAll();
    }
}
