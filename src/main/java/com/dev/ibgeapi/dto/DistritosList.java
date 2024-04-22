package com.dev.ibgeapi.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class DistritosList {
    private List<Distrito> distritosList;
    public DistritosList() {
        distritosList = new ArrayList<>();
    }
}
