package com.petland.petland_api.repository;

import com.petland.petland_api.model.entity.CadastroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<CadastroEntity, Integer> {

}