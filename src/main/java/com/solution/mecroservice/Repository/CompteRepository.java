package com.solution.mecroservice.Repository;

import com.solution.mecroservice.Entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, String> {

}

