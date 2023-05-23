package med.vol.api.domain.medico;

public record dadosListagemMedico(Long id,String nome, String email, String crm, Especialidade especialidade) {

    public dadosListagemMedico(medico medico){
        this(medico.getId(), medico.getNome(),medico.getEmail(),medico.getCrm(),medico.getEspecialidade());
    }

}
