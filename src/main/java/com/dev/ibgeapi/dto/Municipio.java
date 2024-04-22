package com.dev.ibgeapi.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Municipio {
    private Long id;
    private String nome;
    @JsonAlias("microrregiao")
    private MicroRegiao microRegiao;
    @JsonAlias("regiao-imediata")
    private RegiaoImediata regiaoImediata;
}
