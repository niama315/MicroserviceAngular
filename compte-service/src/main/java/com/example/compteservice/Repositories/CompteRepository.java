package com.example.compteservice.Repositories;

import com.example.compteservice.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource
@CrossOrigin("http://localhost:4200")
public interface CompteRepository extends JpaRepository<Compte,Long> {

}
