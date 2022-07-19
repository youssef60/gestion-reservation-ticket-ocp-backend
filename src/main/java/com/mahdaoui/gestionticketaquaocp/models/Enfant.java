package com.mahdaoui.gestionticketaquaocp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
public class Enfant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String matricule;

    String Nom;

    String prenom;

    Date dateNaissance;

    @ManyToOne()
    Collaborateur collaborateur;
}
