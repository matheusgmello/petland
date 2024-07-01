package com.petland.petland_api.controller;


import com.petland.petland_api.model.dto.AnimalResponse;
import com.petland.petland_api.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService service;


    @GetMapping("/animais")
    public List<AnimalResponse> get(){
        return service.listar();
    }
}