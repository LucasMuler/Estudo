package med.vol.api.entitie.paciente;

import jakarta.validation.constraints.NotNull;
import med.vol.api.entitie.endereco.DadosEndereco;

public record DadosAtualizarPaciente(

        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco) {
}
