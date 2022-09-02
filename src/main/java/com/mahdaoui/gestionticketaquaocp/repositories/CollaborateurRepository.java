package com.mahdaoui.gestionticketaquaocp.repositories;

import com.mahdaoui.gestionticketaquaocp.models.Collaborateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollaborateurRepository extends JpaRepository<Collaborateur,Long> {

    Optional<Collaborateur> findCollaborateurByMatricule(String matricule );

    Optional<Collaborateur> findById(Long id);

    @Query( value = "select count(*) from collaborateur" , nativeQuery = true )
    Long getNombreTotalCollaborateur();




}
