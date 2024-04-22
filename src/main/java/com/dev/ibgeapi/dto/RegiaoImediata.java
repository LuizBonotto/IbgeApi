package com.dev.ibgeapi.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class RegiaoImediata {
    private Long id;
    private String nome;
    @JsonAlias ("regiao-intermediaria")
    private RegiaoIntermediaria regiaoIntermediaria;
}
