package pojetoPedidos.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import pojetoPedidos.domain.entity.enums.OrderStatus;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "tb_order")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Este comando faz com que meu instant seja formatado com o padrão ISO8601 no meu JSon
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

}
