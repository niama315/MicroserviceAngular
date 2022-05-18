package com.example.compteservice.entities;

import com.example.compteservice.enums.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

public class CompteProj1 {
    @Projection(name = "p1", types = Compte.class)
    public interface CompteProj2{
        public int getSlode();
        public TypeCompte getType();
    }
}
