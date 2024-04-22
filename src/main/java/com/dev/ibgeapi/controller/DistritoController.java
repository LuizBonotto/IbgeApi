package com.dev.ibgeapi.controller;

import com.dev.ibgeapi.dto.Distrito;
import com.dev.ibgeapi.repository.IbgeRepository;
import com.dev.ibgeapi.service.IbgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distrito")
public class DistritoController {
    @Autowired
    private IbgeService ibgeService;
    @Autowired
    private IbgeRepository ibgeRepository;

    @GetMapping("{numero}")
    public ResponseEntity consultarDistrito(@PathVariable String numero) {
        Distrito[] distrito = ibgeService.retornarDistritos(numero);
        for (Distrito d : distrito) {
            ibgeRepository.insert(d);
        }
        return ResponseEntity.ok(distrito);
    }
}
