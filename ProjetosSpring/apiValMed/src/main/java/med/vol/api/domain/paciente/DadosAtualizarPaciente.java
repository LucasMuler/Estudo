package med.vol.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.vol.api.domain.endereco.DadosEndereco;

public record DadosAtualizarPaciente(

        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco) {
}
