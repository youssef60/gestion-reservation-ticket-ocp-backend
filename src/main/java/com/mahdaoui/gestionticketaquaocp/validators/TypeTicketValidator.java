package com.mahdaoui.gestionticketaquaocp.validators;

import com.mahdaoui.gestionticketaquaocp.models.Ticket;
import com.mahdaoui.gestionticketaquaocp.models.TypeTicket;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class TypeTicketValidator {

    public static List<String> TypeTicketValidate(TypeTicket typeTicket){

        List<String> errors = new ArrayList<>();

        if(typeTicket == null){

            errors.add("veuillez remplir le type");
            errors.add("veuillez remplir le Montant enfant ");
            errors.add("veuillez remplir le Montant Adulte");
            return errors;
        }
        if(StringUtils.hasLength(typeTicket.getType())){

            errors.add("veuillez remplir le Type");

        }

        return  errors;

    }
}
