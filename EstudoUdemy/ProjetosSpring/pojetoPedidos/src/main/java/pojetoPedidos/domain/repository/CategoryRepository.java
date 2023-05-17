package pojetoPedidos.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pojetoPedidos.domain.entity.Category;
import pojetoPedidos.domain.entity.Order;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
