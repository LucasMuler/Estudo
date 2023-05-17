package pojetoPedidos.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "tb_category")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
