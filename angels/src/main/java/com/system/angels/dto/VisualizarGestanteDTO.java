package com.system.angels.dto;

import com.system.angels.domain.Gestante;
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

    public VisualizarGestanteDTO(Gestante gestante) {
        this.id = gestante.getId();
        this.nome = gestante.getNome();
        this.dataNascimento = gestante.getDataNascimento();
        this.cpf = gestante.getCpf();
        this.sexo = gestante.getSexo();
        this.municipio = gestante.getMunicipio();
        this.emRisco = gestante.isEmRisco();
        this.quantidadeAbortos = gestante.getQuantidadeAbortos();
        this.quantidadeFilhosVivos = gestante.getQuantidadeFilhosVivos();
        this.quantidadeGemelares = gestante.getQuantidadeGemelares();
        this.quantidadeGestacao = gestante.getQuantidadeGestacao();
        this.quantidadeNascidosMortos = gestante.getQuantidadeNascidosMortos();
        this.quantidadeNascidosVivos = gestante.getQuantidadeNascidosVivos();
        this.hipertensao = gestante.isHipertensao();
        this.diabetes = gestante.isDiabetes();
        this.maFormacaoCongenita = gestante.isMaFormacaoCongenita();
    }
}
