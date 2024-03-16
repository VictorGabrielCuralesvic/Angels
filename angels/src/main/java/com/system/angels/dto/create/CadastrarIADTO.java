package com.system.angels.dto.create;

import com.system.angels.domain.AcompanhamentoIA;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CadastrarIADTO {

    private Long acompanhamento_id;

    private String nomeModelo;

    private Float probabilidade;

    public CadastrarIADTO(AcompanhamentoIA acompanhamentoIA) {
        this.acompanhamento_id = acompanhamentoIA.getAcompanhamento().getId();
        this.nomeModelo = acompanhamentoIA.getNomeModelo();
        this.probabilidade = acompanhamentoIA.getProbabilidade();
    }

}
