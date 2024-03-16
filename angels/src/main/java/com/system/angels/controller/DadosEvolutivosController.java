package com.system.angels.controller;

import com.system.angels.domain.DadosEvolutivos;
import com.system.angels.domain.Gestante;
import com.system.angels.dto.create.CadastrarDadosEvolutivosDTO;
import com.system.angels.dto.response.VisualizarDadosEvolutivosDTO;
import com.system.angels.service.impl.DadosEvolutivosService;
import com.system.angels.service.impl.GestanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dados-evolutivos")
@RequiredArgsConstructor
public class DadosEvolutivosController {
    private final DadosEvolutivosService service;
    private final GestanteService gestanteService;

    @GetMapping("/gestante/{id}")
    ResponseEntity<List<DadosEvolutivos>> listarDadosEvolutivosPorGestante(@PathVariable Long id) {
        Gestante gestante = gestanteService.buscarGestantePorId(id);
        List<DadosEvolutivos> listaDeDadosEvolutivos = service.listarDadosEvolutivosPorGestante(gestante);
        return ResponseEntity.ok(listaDeDadosEvolutivos);
    }

    @PostMapping("/gestante/{id}")
    ResponseEntity<CadastrarDadosEvolutivosDTO> atualizarDadosEvolutivos(@PathVariable Long id, @RequestBody DadosEvolutivos dadosEvolutivos) {
        Gestante gestante = gestanteService.buscarGestantePorId(id);
        dadosEvolutivos.setGestante(gestante);
        CadastrarDadosEvolutivosDTO cadastrarDadosEvolutivosDTO = new CadastrarDadosEvolutivosDTO(dadosEvolutivos);
        service.registrarDadosEvolutivos(dadosEvolutivos);
        return ResponseEntity.ok(cadastrarDadosEvolutivosDTO);
    }


    // Não tá funcionando :(
    @GetMapping("/{id}")
    ResponseEntity<VisualizarDadosEvolutivosDTO> buscarDadosEvolutivosPorId(@PathVariable Long id) {
        DadosEvolutivos dadosEvolutivos = service.buscarDadosEvolutivosPorId(id);
        VisualizarDadosEvolutivosDTO visualizarDadosEvolutivosDTO = new VisualizarDadosEvolutivosDTO(dadosEvolutivos);
        return ResponseEntity.ok(visualizarDadosEvolutivosDTO);

    }

}
