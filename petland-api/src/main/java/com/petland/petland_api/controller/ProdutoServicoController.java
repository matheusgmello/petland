package com.petland.petland_api.controller;


import com.petland.petland_api.model.ProdutoServico;
import com.petland.petland_api.repository.ProdutoServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoServicoController {

    @Autowired
    private ProdutoServicoRepository repository;

    @GetMapping("/produtos")
    public List<ProdutoServico> listar() {
        return repository.findAll();
    }

    @PostMapping("/produtos")
    public Integer gravar(@RequestBody ProdutoServico requisicao) {
        repository.save(requisicao);
        return requisicao.getId();
    }

}
