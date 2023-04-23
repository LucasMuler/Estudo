package med.vol.api.entitie.paciente;

import jakarta.persistence.*;
import lombok.*;
import med.vol.api.entitie.endereco.Endereco;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;

@Entity(name = "paciente")
@Table(name = "paciente")
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

    @Embedded
    private Endereco endereco;

}
