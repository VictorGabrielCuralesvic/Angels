package com.system.angels.controller;

import com.system.angels.domain.Gestante;
import com.system.angels.service.impl.GestanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gestantes")
@RequiredArgsConstructor
public class GestanteController {
    private final GestanteService service;

    @GetMapping
    public ResponseEntity<List<Gestante>> listarGestantes() {
        List<Gestante> gestantes = service.listarGestantes();
        return ResponseEntity.ok(gestantes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gestante> buscarGestantePorId(@PathVariable Long id) {
        Gestante gestante = service.buscarGestantePorId(id);
        return ResponseEntity.ok(gestante);
    }

    @GetMapping("/cpf/{cpf}")
    public ResponseEntity<Gestante> buscarGestantePorCpf(@PathVariable String cpf) {
        Gestante gestante = service.buscarGestantePorCpf(cpf);
        return ResponseEntity.ok(gestante);
    }
}
