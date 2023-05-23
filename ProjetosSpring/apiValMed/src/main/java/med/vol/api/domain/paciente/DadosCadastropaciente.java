package med.vol.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.vol.api.domain.endereco.DadosEndereco;
import med.vol.api.domain.endereco.*;

public record DadosCadastropaciente(
        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        String cpf,

        @NotNull
        @Valid
        DadosEndereco endereco) {

}
