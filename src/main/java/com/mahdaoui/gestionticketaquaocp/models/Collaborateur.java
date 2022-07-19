package com.mahdaoui.gestionticketaquaocp.models;

import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;
        import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
public class Collaborateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String matricule;

    String Nom;

    String prenom;

    String cin;

    @OneToMany( mappedBy = "collaborateur")
    List<Conjoint> conjoints;

    @OneToMany( mappedBy = "collaborateur" )
    List<Enfant> enfants;

    @OneToMany( mappedBy = "collaborateur")
    List<Ticket> tickets;
}
