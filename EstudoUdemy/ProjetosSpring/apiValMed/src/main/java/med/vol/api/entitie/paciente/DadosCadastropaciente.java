package med.vol.api.entitie.paciente;

import med.vol.api.entitie.endereco.Endereco;

public record DadosCadastropaciente(String nome, String email, String telefone, String cpf,
Endereco endereco) {

}
