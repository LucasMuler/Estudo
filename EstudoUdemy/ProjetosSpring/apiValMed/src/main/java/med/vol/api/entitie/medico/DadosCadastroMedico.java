package med.vol.api.entitie.medico;

import med.vol.api.entitie.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
