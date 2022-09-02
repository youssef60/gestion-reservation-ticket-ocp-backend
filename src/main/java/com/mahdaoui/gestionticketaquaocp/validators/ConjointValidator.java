package com.mahdaoui.gestionticketaquaocp.validators;

import com.mahdaoui.gestionticketaquaocp.models.Collaborateur;
import com.mahdaoui.gestionticketaquaocp.models.Conjoint;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ConjointValidator {

    public static List<String> conjointValidate(Conjoint conjoint){

        List<String> errors = new ArrayList<>();

        if(conjoint == null){
            errors.add("veuillez remplir le nom");
            errors.add("veuillez remplir le matricule");
            errors.add("veuillez remplir le prenom");
            return errors;

        }
     /*   if(StringUtils.hasLength(conjoint.getMatricule())){

            errors.add("veuillez remplir le matricule");

        }*/
        if(!StringUtils.hasLength(conjoint.getNom())){

            errors.add("veuillez remplir le Nom");

        }if(!StringUtils.hasLength(conjoint.getPrenom()))
        {

            errors.add("veuillez remplir le preom");
        }
        return  errors;

    }
}
