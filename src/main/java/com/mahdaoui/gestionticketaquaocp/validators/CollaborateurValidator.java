package com.mahdaoui.gestionticketaquaocp.validators;

import com.mahdaoui.gestionticketaquaocp.models.Collaborateur;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CollaborateurValidator {


    public static List<String> CollaboratorValidate(Collaborateur collaborateur){

        List<String> errors = new ArrayList<>();

        if(collaborateur == null){

            errors.add("veuillez remplir le nom");
            errors.add("veuillez remplir le matricule");
            errors.add("veuillez remplir le prenom");
            errors.add("veuillez remplir le Cin");
            return errors;

        }
        if(!StringUtils.hasLength(collaborateur.getCin())){

            errors.add("veuillez remplir le Cin");

        }
        if(!StringUtils.hasLength(collaborateur.getMatricule())){

            errors.add("veuillez remplir le matricule");

        }
        if(!StringUtils.hasLength(collaborateur.getNom())){

            errors.add("veuillez remplir le Nom");

        }
        if(!StringUtils.hasLength(collaborateur.getPrenom())){

            errors.add("veuillez remplir le preom");
        }
        return  errors;










    }
}
