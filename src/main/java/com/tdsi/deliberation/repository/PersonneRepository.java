package com.tdsi.deliberation.repository;


import com.tdsi.deliberation.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonneRepository extends JpaRepository<Personne,Long> {
    public Personne findByUsername(String username);
}
