package com.example.compteservice.services;

public interface CompteService {

    void virement(Long codeSource,Long codeDestination, int montant);

}
