package com.system.angels.controller;

import com.system.angels.dto.CadastrarDadosAtivosDTO;
import com.system.angels.service.iDadosAtivosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dados-ativos")
public class DadosAtivosController {

    private final iDadosAtivosService dadosAtivosService;

    public DadosAtivosController(iDadosAtivosService dadosAtivosService) {
        this.dadosAtivosService = dadosAtivosService;
    }

    @PostMapping
    public ResponseEntity<CadastrarDadosAtivosDTO> criarDados(@RequestBody CadastrarDadosAtivosDTO cadastrarDadosAtivosDTO) {
        CadastrarDadosAtivosDTO createdCadastrarDadosAtivosDTO = dadosAtivosService.criarDadosAtivos(cadastrarDadosAtivosDTO);
        return new ResponseEntity<>(createdCadastrarDadosAtivosDTO, HttpStatus.CREATED);
    }
}
