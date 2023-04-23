package med.vol.api.entitie.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.vol.api.entitie.endereco.DadosEndereco;
import med.vol.api.entitie.endereco.Endereco;

public record DadosCadastropaciente(
        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @Pattern(regexp = "\\d{4,6}")
        String telefone,

        @NotBlank
        String cpf,

        @NotNull
        @Valid
        DadosEndereco endereco) {

}
