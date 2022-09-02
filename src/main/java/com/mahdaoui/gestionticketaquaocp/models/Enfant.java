package com.mahdaoui.gestionticketaquaocp.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Entity
public class Enfant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String Nom;

    String prenom;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    Date  dateNaissance;


    @ManyToOne()
    Collaborateur collaborateur;

    @JsonBackReference
    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }



    public String getMatricule(){
        return this.collaborateur.matricule;
    }
}
