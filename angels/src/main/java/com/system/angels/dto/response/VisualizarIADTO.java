package com.system.angels.dto.response;

import com.system.angels.domain.AcompanhamentoIA;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VisualizarIADTO {

    private Long acompanhamento_id;

    private String nomeModelo;

    private Float probabilidade;

    public VisualizarIADTO(AcompanhamentoIA acompanhamentoIA) {
        this.acompanhamento_id = acompanhamentoIA.getAcompanhamento().getId();
        this.nomeModelo = acompanhamentoIA.getNomeModelo();
        this.probabilidade = acompanhamentoIA.getProbabilidade();
    }

}
