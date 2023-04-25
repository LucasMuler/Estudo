package med.vol.api.entitie.paciente;

import org.jetbrains.annotations.NotNull;

public record DadosListagemPaciente(String nome, String email, String cpf) {

    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }

}
