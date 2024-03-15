package com.system.angels.dto.response;

import java.math.BigDecimal;
import java.util.Date;

import com.system.angels.domain.Gestacao;
import com.system.angels.domain.Gestante;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VisualizarGestacaoDTO {
    private Long id;
    private Long gestante_id;
    private boolean consumoAlcool;
    private int frequenciaUsoAlcool;
    private Date dataUltimaMenstruacao;
    private Date dataInicioGestacao;
    private String fatorRh;
    private boolean fuma;
    private int quantidadeCigarrosDia;
    private int usoDrogas;
    private boolean gravidezPlanejada;
    private int grupoSanguineo;
    private BigDecimal pesoAntesGestacao;
    private int riscoGestacional;
    private boolean vacinaHepatiteB;
    private int situacaoGestacional;

    public VisualizarGestacaoDTO(Gestacao gestacao) {
        this.id = gestacao.getId();
        this.gestante_id = gestacao.getGestante().getId();
        this.consumoAlcool = gestacao.isConsumoAlcool();
        this.frequenciaUsoAlcool = gestacao.getFrequenciaUsoAlcool();
    }

}
