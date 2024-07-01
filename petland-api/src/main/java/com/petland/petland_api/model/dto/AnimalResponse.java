package com.petland.petland_api.model.dto;

import lombok.Data;

@Data
public class AnimalResponse extends AnimalRequest{
    private Integer id;
}