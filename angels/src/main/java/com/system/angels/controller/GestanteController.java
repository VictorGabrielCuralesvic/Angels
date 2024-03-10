package com.system.angels.controller;

import com.system.angels.domain.DadosEvolutivos;
import com.system.angels.domain.Gestante;
import com.system.angels.dto.create.CadastrarGestanteEDadosEvolutivosDTO;
import com.system.angels.dto.VisualizarGestanteDTO;
import com.system.angels.service.impl.DadosEvolutivosService;
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
    private final DadosEvolutivosService dadosEvolutivosService;

    @GetMapping
    public ResponseEntity<List<Gestante>> listarGestantes() {
        List<Gestante> gestantes = service.listarGestantes();
        return ResponseEntity.ok(gestantes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VisualizarGestanteDTO> buscarGestantePorId(@PathVariable Long id) {
        Gestante gestante = service.buscarGestantePorId(id);
        DadosEvolutivos dadosEvolutivos = dadosEvolutivosService.ultimosDadosEvolutivosPorGestante(gestante);
        VisualizarGestanteDTO gestanteDTO = new VisualizarGestanteDTO(gestante, dadosEvolutivos);

        return ResponseEntity.ok(gestanteDTO);
    }

    @GetMapping("/cpf/{cpf}")
    public ResponseEntity<VisualizarGestanteDTO> buscarGestantePorCpf(@PathVariable String cpf) {
        Gestante gestante = service.buscarGestantePorCpf(cpf);
        DadosEvolutivos dadosEvolutivos = dadosEvolutivosService.ultimosDadosEvolutivosPorGestante(gestante);
        VisualizarGestanteDTO gestanteDTO = new VisualizarGestanteDTO(gestante, dadosEvolutivos);

        return ResponseEntity.ok(gestanteDTO);
    }

    @PostMapping
    public ResponseEntity<CadastrarGestanteEDadosEvolutivosDTO> cadastrarGestante(@RequestBody CadastrarGestanteEDadosEvolutivosDTO gestanteEDadosEvolutivosDTO) {
        Gestante gestante = gestanteEDadosEvolutivosDTO.getGestante();
        DadosEvolutivos dadosEvolutivos = gestanteEDadosEvolutivosDTO.getDadosEvolutivos();
        dadosEvolutivos.setGestante(gestante);

        service.registrarGestante(gestante);
        dadosEvolutivosService.registrarDadosEvolutivos(dadosEvolutivos);

        return ResponseEntity.ok(gestanteEDadosEvolutivosDTO);
    }

    @PutMapping("{id}")
    public ResponseEntity<VisualizarGestanteDTO> atualizarGestante(@PathVariable Long id, @RequestBody Gestante gestanteAtualizada) {
        Gestante gestante = service.atualizarGestante(id, gestanteAtualizada);
        DadosEvolutivos dadosEvolutivos = dadosEvolutivosService.ultimosDadosEvolutivosPorGestante(gestante);
        VisualizarGestanteDTO gestanteDTO = new VisualizarGestanteDTO(gestante, dadosEvolutivos);

        return ResponseEntity.ok(gestanteDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarGestante(@PathVariable Long id) {
        service.deletarGestante(id);
        return ResponseEntity.noContent().build();
    }
}
