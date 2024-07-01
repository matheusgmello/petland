package com.petland.petland_api.cadastros.controller;


import com.petland.petland_api.cadastros.repository.ProdutoServicoRepository;
import com.petland.petland_api.cadastros.model.ProdutoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoServicoController {

    @Autowired
    private ProdutoServicoRepository repository;

    @GetMapping()
    public List<ProdutoServico> listar(){
        return repository.findAll();
    }

    @PostMapping()
    public Integer gravar(@RequestBody ProdutoServico requisicao){
        repository.save(requisicao);
        return requisicao.getId();
    }

    @PutMapping("/{id}")
    public Integer alterar(@PathVariable ("id") Integer id,
                           @RequestBody ProdutoServico requisicao){
        requisicao.setId(id);
        repository.save(requisicao);
        return requisicao.getId();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable ("id") Integer id){
        repository.deleteById(id);

    }


}