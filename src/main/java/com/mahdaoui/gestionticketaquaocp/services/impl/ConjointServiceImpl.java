package com.mahdaoui.gestionticketaquaocp.services.impl;

import com.mahdaoui.gestionticketaquaocp.exceptions.EntityNotFoundException;
import com.mahdaoui.gestionticketaquaocp.exceptions.ErrorCodes;
import com.mahdaoui.gestionticketaquaocp.exceptions.InvalidEntityException;
import com.mahdaoui.gestionticketaquaocp.models.Conjoint;
import com.mahdaoui.gestionticketaquaocp.repositories.CollaborateurRepository;
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

    @Autowired
    CollaborateurRepository collaborateurRepository;

    @Override
    public Conjoint save(Conjoint conjoint) {
        List<String> errors = ConjointValidator.conjointValidate(conjoint);

        if(collaborateurRepository.findCollaborateurByMatricule(conjoint.getMatricule()).isEmpty()){
            errors.add("matricule " + conjoint.getMatricule() + " du collaborateur n'exsiste pas");
        }
        if(!errors.isEmpty()){
            throw new InvalidEntityException("la conjointe n'est pas valide", ErrorCodes.CONJOINT_NOT_VALID,errors);
        }

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
    public void deleteAll() {
        this.conjointRepository.deleteAll();
    }


    @Override
    public List<Conjoint> findAll() {
        return conjointRepository.findAll();
    }
}
