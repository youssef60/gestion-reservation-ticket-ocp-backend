package com.mahdaoui.gestionticketaquaocp.services.impl;

import com.mahdaoui.gestionticketaquaocp.exceptions.EntityNotFoundException;
import com.mahdaoui.gestionticketaquaocp.exceptions.ErrorCodes;
import com.mahdaoui.gestionticketaquaocp.exceptions.InvalidEntityException;
import com.mahdaoui.gestionticketaquaocp.models.Enfant;
import com.mahdaoui.gestionticketaquaocp.repositories.EnfantRepository;
import com.mahdaoui.gestionticketaquaocp.services.EnfantService;
import com.mahdaoui.gestionticketaquaocp.validators.EnfantValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class EnfantServiceImpl implements EnfantService {

    @Autowired
    EnfantRepository enfantRepository;

    @Override
    public Enfant save(Enfant enfant) {
        List<String> errors = EnfantValidator.enfantValidate(enfant);
        if(!errors.isEmpty()){
            throw new InvalidEntityException("l'enfant est invalid", ErrorCodes.ENFANT_NOT_VALID,errors);

        }
        return enfantRepository.save(enfant);
    }

    @Override
    public void deleteById(Long id) {
        if(id == null){
            throw new EntityNotFoundException("l'id est nulle");
        }
        enfantRepository.deleteById(id);
    }

    @Override
    public List<Enfant> findAllByMatricule(String matricule) {
        if(!StringUtils.hasLength(matricule)){
            throw new EntityNotFoundException("le matricule n'est pas valide");
        }
        return enfantRepository.findAllByMatricule(matricule).orElseThrow(
                () -> new EntityNotFoundException("le matricule " +matricule+ "n'existe pas " )
        );

    }

    @Override
    public List<Enfant> findAll() {
        return enfantRepository.findAll();
    }
}
