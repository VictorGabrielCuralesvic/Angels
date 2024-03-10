package com.system.angels.dto.create;

import com.system.angels.domain.Exame;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CadastrarExameDTO {
    private Long acompanhamentoId;
    private String tipo;
    private String resultado;
    private String observacao;

    public CadastrarExameDTO(Exame exame) {
        this.acompanhamentoId = exame.getAcompanhamento().getId();
        this.tipo = exame.getTipo();
        this.resultado = exame.getResultado();
        this.observacao = exame.getObservacao();
    }
}
