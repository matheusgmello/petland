package com.petland.petland_api.repository;

import com.petland.petland_api.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository  extends JpaRepository<Animal, Integer> {
}