package com.system.angels.dto;

import com.system.angels.domain.Gestante;

import java.math.BigDecimal;
import java.util.Date;

public class AcompanhamentoCadastroDTO {

    private Gestante gestanteId;
    private Date dataAcompanhamento;
    private String realizadoPor;  // Pode ser "médico" ou "enfermeiro"
    private BigDecimal pesoAtual;
    private int idadeGestacional;
    private String pressaoArterial;
    private Integer batimentosCardiacosFeto;  // Pode ser vazio
    private Integer alturaUterina;  // Pode ser vazio
    private String tipo;  // Pode ser "pré-natal de rotina", "ocorrência" ou "volta"

}
