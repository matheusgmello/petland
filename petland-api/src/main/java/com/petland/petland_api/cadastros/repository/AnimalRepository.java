package com.petland.petland_api.cadastros.repository;

import com.petland.petland_api.cadastros.model.entity.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository  extends JpaRepository<AnimalEntity, Integer> {
}