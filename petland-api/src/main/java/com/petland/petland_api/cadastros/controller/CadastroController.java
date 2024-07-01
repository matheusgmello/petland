package com.petland.petland_api.cadastros.controller;

import com.petland.petland_api.cadastros.service.CadastroService;
import com.petland.petland_api.cadastros.model.dto.CadastroRequest;
import com.petland.petland_api.cadastros.model.dto.CadastroResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {

    @Autowired
    private CadastroService service;


    @GetMapping
    public List<CadastroResponse> get(){
        return service.listar();
    }

    @PostMapping()
    public Integer gravar(@RequestBody CadastroRequest requisicao){
        return service.gravar(requisicao);
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable ("id") Integer id,
                           @RequestBody CadastroRequest requisicao){
        return service.alterar(id, requisicao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable ("id") Integer id){
        service.excluir(id);
    }
}