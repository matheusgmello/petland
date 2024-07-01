package com.petland.petland_api.service;

import java.util.ArrayList;
import java.util.List;

import com.petland.petland_api.model.dto.AnimalRequest;
import com.petland.petland_api.model.dto.AnimalResponse;
import com.petland.petland_api.model.entity.AnimalEntity;
import com.petland.petland_api.repository.AnimalRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AnimalService {
    @Autowired
    private AnimalRepository repository;
    private AnimalRequest requisicao;

    public Integer gravar(AnimalRequest requisicao){
        this.requisicao = requisicao;
        AnimalEntity entidade = new AnimalEntity();
        BeanUtils.copyProperties(requisicao, entidade);
        return repository.save(entidade).getId();
    }

    public Integer alterar(Integer id, AnimalRequest requisicao){
        AnimalEntity entidade =  repository.findById(id).orElse(null);
        if(entidade != null){
            BeanUtils.copyProperties(requisicao, entidade);
            return repository.save(entidade).getId();
        }
        return null;
    }

    public List<AnimalResponse> listar(){
        List<AnimalEntity> entities = repository.findAll();
        List<AnimalResponse> response = new ArrayList<>();
        for (AnimalEntity e: entities){
            AnimalResponse res = new AnimalResponse();
            BeanUtils.copyProperties(e, res);
            response.add(res);
        }
        return response;
    }

    public void excluir(Integer id){
        repository.deleteById(id);
    }
}