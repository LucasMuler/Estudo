package med.vol.api.entitie.paciente;

import jakarta.persistence.*;
import lombok.*;
import med.vol.api.entitie.endereco.Endereco;
import org.springframework.web.bind.annotation.RequestMapping;

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
        this.endereco = dados.endereco();
    }

}
