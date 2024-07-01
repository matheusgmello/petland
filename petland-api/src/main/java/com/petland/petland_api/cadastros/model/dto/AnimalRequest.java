package com.petland.petland_api.cadastros.model.dto;

import com.petland.petland_api.cadastros.model.AnimalEspecie;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AnimalRequest {
    private String nome;
    private LocalDate aniversário;
    private AnimalEspecie especie;
}