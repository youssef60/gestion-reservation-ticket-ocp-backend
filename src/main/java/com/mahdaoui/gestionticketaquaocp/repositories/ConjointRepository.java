package com.mahdaoui.gestionticketaquaocp.repositories;

import com.mahdaoui.gestionticketaquaocp.models.Conjoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConjointRepository extends JpaRepository<Conjoint,Long> {


}
