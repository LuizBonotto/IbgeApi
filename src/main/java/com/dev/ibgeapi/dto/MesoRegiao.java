package com.dev.ibgeapi.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class MesoRegiao {
    private Long id;
    private String nome;
    @JsonAlias("UF")
    private UF uf;
}
