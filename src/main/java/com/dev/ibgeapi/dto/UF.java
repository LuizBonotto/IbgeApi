package com.dev.ibgeapi.dto;

import lombok.Data;

@Data
public class UF {
    private Long id;
    private String sigla;
    private String nome;
    private Regiao regiao;
}
