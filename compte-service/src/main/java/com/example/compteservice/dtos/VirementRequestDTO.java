package com.example.compteservice.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class VirementRequestDTO {

    private Long codeSource;
    private Long codeDestination;
    private int montant;

}
