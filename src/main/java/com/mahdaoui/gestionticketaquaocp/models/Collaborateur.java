package com.mahdaoui.gestionticketaquaocp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Entity
public class Collaborateur {



    @Id
    String matricule;

    String Nom;

    String prenom;

    String cin;

    @Column(columnDefinition = "boolean default false")
    boolean prisMaxTicket;

    @Column(columnDefinition = "boolean default false")
    boolean prisTicket;



    @OneToMany( mappedBy = "collaborateur")
    List<Conjoint> conjoints;




    @OneToMany( mappedBy = "collaborateur" )
    List<Enfant> enfants;

    @JsonManagedReference
    public List<Enfant> getEnfants() {
        return enfants;
    }

    @JsonIgnore
    @OneToMany( mappedBy = "collaborateur")
    List<Ticket> tickets;

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public boolean getPrisMaxTicket() { return prisMaxTicket; }

    public boolean getPrisTicket() { return prisTicket; }




    public String getCin() {
        return cin;
    }

    @JsonManagedReference
    public List<Conjoint> getConjoints() {
        return conjoints;
    }



    @JsonManagedReference
    public List<Ticket> getTickets() {
        return tickets;
    }
}
