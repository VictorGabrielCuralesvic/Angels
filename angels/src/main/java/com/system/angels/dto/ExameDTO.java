package com.system.angels.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ExameDTO {
    private Long acompanhamentoId;
    private String tipo;
    private String resultado;
    private String observacao;
}
