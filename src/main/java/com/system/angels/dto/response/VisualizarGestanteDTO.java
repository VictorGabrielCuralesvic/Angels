package com.system.angels.dto.response;

import com.system.angels.domain.DadosEvolutivos;
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

    public VisualizarGestanteDTO(Gestante gestante, DadosEvolutivos dadosEvolutivos) {
        this.id = gestante.getId();
        this.nome = gestante.getNome();
        this.dataNascimento = gestante.getDataNascimento();
        this.cpf = gestante.getCpf();
        this.sexo = gestante.getSexo();
        this.municipio = dadosEvolutivos.getMunicipio();
        this.emRisco = dadosEvolutivos.isEmRisco();
        this.quantidadeAbortos = dadosEvolutivos.getQuantidadeAbortos();
        this.quantidadeFilhosVivos = dadosEvolutivos.getQuantidadeFilhosVivos();
        this.quantidadeGemelares = dadosEvolutivos.getQuantidadeGemelares();
        this.quantidadeGestacao = dadosEvolutivos.getQuantidadeGestacao();
        this.quantidadeNascidosMortos = dadosEvolutivos.getQuantidadeNascidosMortos();
        this.quantidadeNascidosVivos = dadosEvolutivos.getQuantidadeNascidosVivos();
        this.hipertensao = dadosEvolutivos.isHipertensao();
        this.diabetes = dadosEvolutivos.isDiabetes();
        this.maFormacaoCongenita = dadosEvolutivos.isMaFormacaoCongenita();
    }
}
