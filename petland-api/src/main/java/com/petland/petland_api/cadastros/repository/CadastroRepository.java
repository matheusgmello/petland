package com.petland.petland_api.cadastros.repository;

import com.petland.petland_api.cadastros.model.entity.CadastroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<CadastroEntity, Integer> {

}