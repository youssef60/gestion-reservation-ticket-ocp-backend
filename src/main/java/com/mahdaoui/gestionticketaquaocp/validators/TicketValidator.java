package com.mahdaoui.gestionticketaquaocp.validators;

import com.mahdaoui.gestionticketaquaocp.models.Enfant;
import com.mahdaoui.gestionticketaquaocp.models.Ticket;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class TicketValidator {

    public static List<String> TicketValidate(Ticket ticket){

        List<String> errors = new ArrayList<>();

        if(ticket == null){

            errors.add("veuillez remplir le matricule");
            errors.add("veuillez remplir le nombre de ticket adulte ");
            errors.add("veuillez remplir le nombre de ticket enfant");
            return errors;
        }

        return  errors;

    }
}
