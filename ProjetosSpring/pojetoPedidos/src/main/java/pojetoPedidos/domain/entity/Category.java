package pojetoPedidos.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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

    @ManyToMany(mappedBy = "categorys")
    @JsonIgnore
    private Set<Product> product = new HashSet<>();

    public Category(Long id, String nome) {
        this.id = id;
        this.name = nome;
    }
}
