package med.vol.api.entitie.paciente;

import org.jetbrains.annotations.NotNull;

public record DadosListagemPaciente(Long id,String nome, String email, String cpf) {

    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }

}
