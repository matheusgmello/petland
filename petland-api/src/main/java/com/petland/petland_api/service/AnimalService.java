package com.petland.petland_api.service;

import java.util.ArrayList;
import java.util.List;

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
}