package com.dev.ibgeapi.dto;

import lombok.Data;

@Data
public class Distrito {
    private Long id;
    private String nome;
    private Municipio municipio;
}
