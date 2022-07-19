package com.mahdaoui.gestionticketaquaocp.services;


import com.mahdaoui.gestionticketaquaocp.models.Conjoint;
import com.mahdaoui.gestionticketaquaocp.models.TypeTicket;

import java.util.List;
import java.util.Optional;

public interface TypeTicketService {


    public TypeTicket save(TypeTicket typeTicket);

    public void  deleteById(Long id);

    String findTypeTicketByType(String type);

    public List<TypeTicket> findAll();

}
