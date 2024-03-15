package com.system.angels.dto.create;

import com.system.angels.domain.DadosEvolutivos;
import com.system.angels.domain.Gestante;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class CadastrarGestanteEDadosEvolutivosDTO {
    @Id
    private Long id;

    private Gestante gestante;
    private DadosEvolutivos dadosEvolutivos;

    public CadastrarGestanteEDadosEvolutivosDTO(Gestante gestante, DadosEvolutivos dadosEvolutivos) {
        this.gestante = gestante;
        this.dadosEvolutivos = dadosEvolutivos;
    }
}
