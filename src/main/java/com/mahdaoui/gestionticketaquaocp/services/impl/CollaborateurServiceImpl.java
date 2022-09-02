package com.mahdaoui.gestionticketaquaocp.services.impl;

import com.mahdaoui.gestionticketaquaocp.exceptions.EntityNotFoundException;
import com.mahdaoui.gestionticketaquaocp.exceptions.ErrorCodes;
import com.mahdaoui.gestionticketaquaocp.exceptions.InvalidEntityException;
import com.mahdaoui.gestionticketaquaocp.models.Collaborateur;
import com.mahdaoui.gestionticketaquaocp.repositories.CollaborateurRepository;
import com.mahdaoui.gestionticketaquaocp.services.CollaborateurService;
import com.mahdaoui.gestionticketaquaocp.validators.CollaborateurValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class CollaborateurServiceImpl  implements CollaborateurService {

    @Autowired
    CollaborateurRepository collaborateurRepository;


    @Override
    public Collaborateur update(Collaborateur collaborateur) {
       /* List<String> errors = CollaborateurValidator.CollaboratorValidate(collaborateur);
        if(!errors.isEmpty()){
            throw new InvalidEntityException("collaborateur n'est pas valide" , ErrorCodes.COLLABORATEUR_NOT_VALID,errors);
        }*/

        if(collaborateurRepository.findCollaborateurByMatricule(collaborateur.getMatricule()).isEmpty()){
            throw new InvalidEntityException("collaborateur n'existe pas" , ErrorCodes.COLLABORATEUR_NOT_FOUND);
        }


        return collaborateurRepository.save(collaborateur) ;
    }

    @Override
    public Collaborateur save(Collaborateur collaborateur) {
        List<String> errors = CollaborateurValidator.CollaboratorValidate(collaborateur);
        var c = collaborateurRepository.findCollaborateurByMatricule(collaborateur.getMatricule());
        if(c.isPresent()){
            errors.add("cette matricule est dupliqué " + collaborateur.getMatricule());
        }
        if(!errors.isEmpty()){
            throw new InvalidEntityException("collaborateur n'est pas valide" , ErrorCodes.COLLABORATEUR_NOT_VALID,errors);
        }

        return collaborateurRepository.save(collaborateur) ;
    }

    @Override
    public void deleteAll() {

        collaborateurRepository.deleteAll();

    }

    @Override
    public Collaborateur findCollaborateurByMatricule(String matricule) {
        if(!StringUtils.hasLength(matricule)){
            throw new EntityNotFoundException("le matricule est nulle");
        }
        return collaborateurRepository.findCollaborateurByMatricule(matricule).orElseThrow(
                ()-> new EntityNotFoundException("matricule " + matricule +"n'existe pas", ErrorCodes.COLLABORATEUR_NOT_FOUND)
        );
    }

    @Override
    public Long countAllCollaborateurs() {
        return collaborateurRepository.getNombreTotalCollaborateur();
    }


    @Override
    public List<Collaborateur> findAll() {
        return collaborateurRepository.findAll();
    }
}
