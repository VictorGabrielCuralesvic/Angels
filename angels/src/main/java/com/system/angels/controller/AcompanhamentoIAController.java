package com.system.angels.controller;

import com.system.angels.domain.Acompanhamento;
import com.system.angels.domain.AcompanhamentoIA;
import com.system.angels.dto.create.CadastrarAcompanhamentoDTO;
import com.system.angels.dto.create.CadastrarIADTO;
import com.system.angels.dto.response.VisualizarIADTO;
import com.system.angels.service.impl.AcompanhamentoIAService;
import com.system.angels.service.impl.AcompanhamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/IA")
@RequiredArgsConstructor
public class AcompanhamentoIAController {

    private final AcompanhamentoIAService acompanhamentoIAService;
    private final AcompanhamentoService acompanhamentoService;

    @GetMapping
    public ResponseEntity<List<AcompanhamentoIA>> listarIAs() {
        List<AcompanhamentoIA> acompanhamentoIAs = acompanhamentoIAService.listarAcompanhamentoIA();
        return ResponseEntity.ok(acompanhamentoIAs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VisualizarIADTO> buscarIAPorId(@PathVariable Long id) {
        AcompanhamentoIA acompanhamentoIA = acompanhamentoIAService.buscarAcompanhamentoIAPorId(id);
        VisualizarIADTO visualizarIADTO = new VisualizarIADTO(acompanhamentoIA);
        return ResponseEntity.ok(visualizarIADTO);
    }

    @PostMapping("/{acompanhamentoId}")
    public ResponseEntity<CadastrarIADTO> cadastrarIA(@PathVariable Long acompanhamentoId, @RequestBody CadastrarIADTO cadastrarIADTO) {
        AcompanhamentoIA acompanhamentoIA = new AcompanhamentoIA();
        Acompanhamento acompanhamento = acompanhamentoService.buscarAcompanhamentoPorId(acompanhamentoId);

        if (acompanhamento.getRiscoIA()) {
            acompanhamentoIA.setAcompanhamento(acompanhamento);
            acompanhamentoIA.setNomeModelo(cadastrarIADTO.getNomeModelo());
            acompanhamentoIA.setProbabilidade(cadastrarIADTO.getProbabilidade());

            AcompanhamentoIA adicionadoIA = acompanhamentoIAService.registrarAcompanhamentoIA(acompanhamentoIA);

            CadastrarIADTO adicionadoIADTO = new CadastrarIADTO(adicionadoIA);

            return ResponseEntity.ok(adicionadoIADTO);
        } else {
            return null;
        }

    }
}
