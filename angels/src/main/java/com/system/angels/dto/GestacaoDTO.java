package com.system.angels.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class GestacaoDTO {
    private boolean consumoAlcool;
    private String frequenciaAlcool;
    private Date ultimaMenstruacao;
    private Date gestacaoInicio;
    private String fatorRh;
    private boolean fuma;
    private int cigarrosPorDia;
    private boolean drogasUso;
    private boolean planejada;
    private String grupoSanguineo;
    private int pesoPre;
    private boolean riscoGestacional;
    private boolean hepatiteb;
    private String situacaoGestacional;

}
