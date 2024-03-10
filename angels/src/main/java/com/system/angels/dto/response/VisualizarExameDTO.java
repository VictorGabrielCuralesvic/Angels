package com.system.angels.dto.response;

import com.system.angels.domain.Acompanhamento;
import com.system.angels.domain.Exame;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class VisualizarExameDTO {
    private Long id;
    private Long acompanhamentoId;
    private String tipo;
    private String resultado;
    private String observacao;

    public VisualizarExameDTO(Exame exame) {
        this.id = exame.getId();
        this.acompanhamentoId = exame.getAcompanhamento().getId();
        this.tipo = exame.getTipo();
        this.resultado = exame.getResultado();
        this.observacao = exame.getObservacao();
    }
}
