package com.petland.petland_api.cadastros.repository;

import com.petland.petland_api.cadastros.model.ProdutoServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoServicoRepository extends JpaRepository<ProdutoServico, Integer> {

}