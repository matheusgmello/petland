package com.petland.petland_api.controller;


import com.petland.petland_api.model.dto.AnimalRequest;
import com.petland.petland_api.model.dto.AnimalResponse;
import com.petland.petland_api.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    private AnimalService service;


    @GetMapping
    public List<AnimalResponse> get(){
        return service.listar();
    }

    @PostMapping()
    public Integer gravar(@RequestBody AnimalRequest requisicao){
        return service.gravar(requisicao);
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable ("id") Integer id,
                           @RequestBody AnimalRequest requisicao){
        return service.alterar(id, requisicao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable ("id") Integer id){
        service.excluir(id);
    }
}