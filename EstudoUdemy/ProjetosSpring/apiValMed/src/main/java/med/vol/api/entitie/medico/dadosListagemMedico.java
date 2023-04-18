package med.vol.api.entitie.medico;

public record dadosListagemMedico(String nome, String email, String crm, Especialidade especialidade) {

    public dadosListagemMedico(medico medico){
        this(medico.getNome(),medico.getEmail(),medico.getCrm(),medico.getEspecialidade());
    }

}
