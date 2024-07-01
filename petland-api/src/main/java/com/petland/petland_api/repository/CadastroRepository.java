package com.petland.petland_api.repository;

import com.petland.petland_api.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {

}