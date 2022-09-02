package com.mahdaoui.gestionticketaquaocp.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Ticket implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    int nbrTicketAdulte;

    int nbrTicketEnfant;

    double total;

    @CreatedDate
    @Column(name = "created_date")
    private Date createdTime;

    @ManyToOne()
    @JoinColumn( name =  "collaborateur_matricule")
    Collaborateur collaborateur;

    @ManyToOne()
    TypeTicket typeTicket;

    public Long getId() {
        return id;
    }


    public double getTotal() {
        return total;
    }

    public int getNbrTicketAdulte() {
        return nbrTicketAdulte;
    }

    public int getNbrTicketEnfant() {
        return nbrTicketEnfant;
    }

    public TypeTicket getTypeTicket() {
        return typeTicket;
    }

    @JsonBackReference
    public  Collaborateur getCollaborateur(){ return collaborateur; };
}
