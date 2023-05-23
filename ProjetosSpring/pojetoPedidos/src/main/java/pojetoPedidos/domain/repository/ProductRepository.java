package pojetoPedidos.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pojetoPedidos.domain.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
