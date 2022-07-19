package com.mahdaoui.gestionticketaquaocp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
public class TypeTicket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    int montantEnfant;

    int montantAdulte;

    String type;

    String ville;

    @OneToMany( mappedBy = "typeTicket")
    List<Ticket> tickets;
}
