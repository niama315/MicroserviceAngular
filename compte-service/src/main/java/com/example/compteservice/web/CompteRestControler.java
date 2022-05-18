package com.example.compteservice.web;

import com.example.compteservice.Repositories.CompteRepository;
import com.example.compteservice.entities.Compte;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
public class CompteRestControler {

    private CompteRepository compteRepository;

    private CompteRestControler(CompteRepository compteRepository){
        this.compteRepository = compteRepository;
    }

    @GetMapping(path = "/comptes")
    public List<Compte> listComptes(){
        return compteRepository.findAll();
    }

    @GetMapping(path = "/comptes/{id}")
    public Compte getCompte(Long id){
        return compteRepository.findById(id).get();
    }

    @PostMapping(path ="/comptes")
    public Compte save(@RequestBody Compte compte){
        return compteRepository.save(compte);
    }

    @PutMapping (path ="/comptes/{code}")
    public Compte update(@PathVariable Long code, @RequestBody Compte compte){
        compte.setCode(code);
        return compteRepository.save(compte);
    }

    @DeleteMapping (path ="/comptes/{code}")
    public void delete(@PathVariable Long code, @RequestBody Compte compte){
        compteRepository.deleteById(code);
    }
}
