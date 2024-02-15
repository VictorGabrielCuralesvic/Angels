package com.system.angels.controller;

import com.system.angels.domain.Gestante;
import com.system.angels.dto.VisualizarGestanteDTO;
import com.system.angels.service.impl.GestanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<VisualizarGestanteDTO> buscarGestantePorId(@PathVariable Long id) {
        Gestante gestante = service.buscarGestantePorId(id);
        VisualizarGestanteDTO gestanteDTO = new VisualizarGestanteDTO(gestante);
        return ResponseEntity.ok(gestanteDTO);
    }

    @GetMapping("/cpf/{cpf}")
    public ResponseEntity<VisualizarGestanteDTO> buscarGestantePorCpf(@PathVariable String cpf) {
        Gestante gestante = service.buscarGestantePorCpf(cpf);
        VisualizarGestanteDTO gestanteDTO = new VisualizarGestanteDTO(gestante);
        return ResponseEntity.ok(gestanteDTO);
    }

    @PutMapping("{id}")
    public ResponseEntity<VisualizarGestanteDTO> atualizarGestante(@PathVariable Long id, @RequestBody Gestante gestanteAtualizada) {
        Gestante gestante = service.atualizarGestante(id, gestanteAtualizada);
        VisualizarGestanteDTO gestanteDTO = new VisualizarGestanteDTO(gestante);
        return ResponseEntity.ok(gestanteDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarGestante(@PathVariable Long id) {
        service.deletarGestante(id);
        return ResponseEntity.noContent().build();
    }
}
