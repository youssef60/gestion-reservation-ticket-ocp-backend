package com.mahdaoui.gestionticketaquaocp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
public class Conjoint implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    Long id;

    String matricule;

    String Nom;

    String prenom;

    @ManyToOne()
    Collaborateur collaborateur;
}
