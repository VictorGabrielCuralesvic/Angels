package com.system.angels.dto;

import com.system.angels.domain.Acompanhamento;
import com.system.angels.domain.Gestante;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CadastroAcompanhamentoDTO {

    private Long gestante_id;
    private Date dataAcompanhamento;
    private String realizadoPor;  // Pode ser "médico" ou "enfermeiro"
    private BigDecimal pesoAtual;
    private int idadeGestacional;
    private String pressaoArterial;
    private Integer batimentosCardiacosFeto;  // Pode ser vazio
    private Integer alturaUterina;  // Pode ser vazio
    private String tipo;  // Pode ser "pré-natal de rotina", "ocorrência" ou "volta"

    public CadastroAcompanhamentoDTO(Acompanhamento acompanhamento) {
        this.gestante_id = acompanhamento.getGestante().getId();
        this.dataAcompanhamento = acompanhamento.getDataAcompanhamento();
        this.realizadoPor = acompanhamento.getRealizadoPor();
        this.pesoAtual = acompanhamento.getPesoAtual();
        this.idadeGestacional = acompanhamento.getIdadeGestacional();
        this.pressaoArterial = acompanhamento.getPressaoArterial();
        this.batimentosCardiacosFeto = acompanhamento.getBatimentosCardiacosFeto();
        this.alturaUterina = acompanhamento.getAlturaUterina();
        this.tipo = acompanhamento.getTipo();
    }

}
