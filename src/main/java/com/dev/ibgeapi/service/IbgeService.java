package com.dev.ibgeapi.service;

import com.dev.ibgeapi.dto.Distrito;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class IbgeService {

    public Distrito[] retornarDistritos(String codigoIbge) {
        String url = "https://servicodados.ibge.gov.br";
        String uri = "/api/v1/localidades/microrregioes/{codigoIbge}/distritos";

        Distrito[] distritos = WebClient
                .create(url)
                .get()
                .uri(uri, codigoIbge)
                .retrieve()
                .bodyToMono(Distrito[].class).block();

        return distritos;
    }
}
