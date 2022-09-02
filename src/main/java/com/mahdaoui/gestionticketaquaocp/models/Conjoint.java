package com.mahdaoui.gestionticketaquaocp.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Entity
public class Conjoint implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    Long id;


    String Nom;

    String prenom;


    @ManyToOne()
    @JoinColumn( name =  "collaborateur_matricule")
    Collaborateur collaborateur;

    public Long getId() {
        return id;
    }



    public String getMatricule() {
        return collaborateur.matricule;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @JsonBackReference
    public Collaborateur getCollaborateur() {
        return collaborateur;
    }
}
