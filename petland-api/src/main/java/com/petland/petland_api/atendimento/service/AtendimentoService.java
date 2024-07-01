package com.petland.petland_api.atendimento.service;

import com.petland.petland_api.atendimento.model.dto.AtendimentoRequest;
import com.petland.petland_api.atendimento.model.entity.AtendimentoEntity;
import com.petland.petland_api.atendimento.repository.AtendimentoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository repository;

    public Integer gravar(AtendimentoRequest requisicao){
        AtendimentoEntity entidade = new AtendimentoEntity();
        BeanUtils.copyProperties(requisicao, entidade);
        return repository.save(entidade).getId();
    }
}