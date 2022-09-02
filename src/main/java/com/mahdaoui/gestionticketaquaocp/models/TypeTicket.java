package com.mahdaoui.gestionticketaquaocp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString

@Setter
@Entity
public class TypeTicket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    int montantEnfant;

    int montantAdulte;

    @Column(unique=true)
    String type;

    String ville;

    @JsonIgnore
    @OneToMany( mappedBy = "typeTicket")
    List<Ticket> tickets;


    public Long getId() {
        return id;
    }

    public int getMontantEnfant() {
        return montantEnfant;
    }

    public int getMontantAdulte() {
        return montantAdulte;
    }

    public String getType() {
        return type;
    }

    public String getVille() {
        return ville;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
}
