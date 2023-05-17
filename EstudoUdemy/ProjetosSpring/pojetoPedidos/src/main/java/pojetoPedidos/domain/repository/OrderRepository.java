package pojetoPedidos.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pojetoPedidos.domain.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
