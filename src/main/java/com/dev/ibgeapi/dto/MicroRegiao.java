package com.dev.ibgeapi.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class MicroRegiao {
    private Long id;
    private String nome;
    @JsonAlias("mesorregiao")
    private MesoRegiao mesoRegiao;
}
