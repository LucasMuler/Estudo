package med.vol.api.domain.paciente;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;
import med.vol.api.domain.endereco.Endereco;

import java.io.Serializable;

@Entity(name = "pacientes")
@Table(name = "pacientes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Paciente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    private boolean ativo;

    @Embedded
    private Endereco endereco;

    public Paciente(DadosCadastropaciente dados){
        this.ativo = true;
        this.nome = dados.nome();
        this.email = dados.email();
        this.cpf = dados.cpf();
        this.telefone = dados.telefone();
        this.cpf = dados.cpf();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarDados(@Valid DadosAtualizarPaciente dados){
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.telefone() != null){
            this.telefone = dados.telefone();
        }
        if(dados.endereco() != null){
            endereco.atualizarInformacoes(dados.endereco());
        }
    }

    public void deletar(){
        this.ativo = false;
    }
}
