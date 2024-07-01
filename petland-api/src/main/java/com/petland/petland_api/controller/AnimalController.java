package com.petland.petland_api.controller;


import com.petland.petland_api.model.Animal;
import com.petland.petland_api.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    public AnimalRepository animalRepository;

    @GetMapping("/animais")
    public List<Animal> listar() {
        return animalRepository.findAll();
    }
}
