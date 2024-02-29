package com.system.angels.dto;

public class GestanteEDadosEvolutivosDTO {
    private GestanteCadastroDTO gestanteDTO;
    private CadastrarDadosEvolutivosDTO dadosEvolutivosDTO;

    public GestanteEDadosEvolutivosDTO(GestanteCadastroDTO gestanteDTO, CadastrarDadosEvolutivosDTO dadosEvolutivosDTO) {
        this.gestanteDTO = gestanteDTO;
        this.dadosEvolutivosDTO = dadosEvolutivosDTO;
    }
}
