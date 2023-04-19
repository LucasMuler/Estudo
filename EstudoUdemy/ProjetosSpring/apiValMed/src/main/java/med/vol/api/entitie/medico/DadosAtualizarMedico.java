package med.vol.api.entitie.medico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.vol.api.entitie.endereco.DadosEndereco;

public record DadosAtualizarMedico(

        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco) {
}
