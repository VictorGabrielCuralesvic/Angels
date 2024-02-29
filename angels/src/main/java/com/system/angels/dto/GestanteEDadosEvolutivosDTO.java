package com.system.angels.dto;

import com.system.angels.domain.DadosEvolutivos;
import com.system.angels.domain.Gestante;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class GestanteEDadosEvolutivosDTO {
    @Id
    private Long id;

    private Gestante gestante;
    private DadosEvolutivos dadosEvolutivos;

    public GestanteEDadosEvolutivosDTO(Gestante gestante, DadosEvolutivos dadosEvolutivos) {
        this.gestante = gestante;
        this.dadosEvolutivos = dadosEvolutivos;
    }
}
