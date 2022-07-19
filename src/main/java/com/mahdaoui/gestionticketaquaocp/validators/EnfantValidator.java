package com.mahdaoui.gestionticketaquaocp.validators;

import com.mahdaoui.gestionticketaquaocp.models.Conjoint;
import com.mahdaoui.gestionticketaquaocp.models.Enfant;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EnfantValidator {

    public static List<String> enfantValidate(Enfant enfant){

        List<String> errors = new ArrayList<>();

        if(enfant == null){
            errors.add("veuillez remplir le nom");
            errors.add("veuillez remplir le matricule");
            errors.add("veuillez remplir le prenom");
            errors.add("veuillez remplir la date de naissance");
            return errors;
        }
        if(StringUtils.hasLength(enfant.getMatricule())){

            errors.add("veuillez remplir le matricule");

        }
        if(StringUtils.hasLength(enfant.getNom())){

            errors.add("veuillez remplir le Nom");

        }
        if(StringUtils.hasLength(enfant.getPrenom())){

            errors.add("veuillez remplir le preom");
        }
        if(enfant.getDateNaissance() == null){
            errors.add("veuillez remplir le preom");
        }
        return  errors;

    }
}
