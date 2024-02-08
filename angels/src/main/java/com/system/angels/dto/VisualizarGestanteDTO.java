package com.system.angels.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VisualizarGestanteDTO {
    private Long id;
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String sexo;
    private String municipio;
    private boolean emRisco;
    private int quantidadeAbortos;
    private int quantidadeFilhosVivos;
    private int quantidadeGemelares;
    private int quantidadeGestacao;
    private int quantidadeNascidosMortos;
    private int quantidadeNascidosVivos;
    private boolean hipertensao;
    private boolean diabetes;
    private boolean maFormacaoCongenita;
}
