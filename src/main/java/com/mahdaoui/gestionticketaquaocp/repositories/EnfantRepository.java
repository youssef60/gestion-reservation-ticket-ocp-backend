package com.mahdaoui.gestionticketaquaocp.repositories;

import com.mahdaoui.gestionticketaquaocp.models.Enfant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EnfantRepository extends JpaRepository<Enfant,Long> {

    Optional<List<Enfant>> findAllByCollaborateur_Matricule(String matricule);
}
