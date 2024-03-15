package com.system.angels.dto.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class AtualizarExameDTO {
    private Long id;
    private Long acompanhamentoId;
    private String tipo;
    private String resultado;
    private String observacao;
}
