package com.system.angels.dto;

import com.system.angels.enums.TipoAcompanhamento;

import java.util.Date;

public class AcompanhamentoDTO {

    private Long acompanhamentoId;
    private Date dataAcompanhamento;
    private String realizadoPor;  // Pode ser "médico" ou "enfermeiro"
    private double pesoAtual;
    private int idadeGestacional;
    private String pressaoArterial;
    private int batimentosCardiacosFeto;  // Pode ser vazio
    private String alturaUterina;  // Pode ser vazio
    private TipoAcompanhamento tipoAcompanhamento;  // Pode ser "pré-natal de rotina", "ocorrência" ou "volta"

}
