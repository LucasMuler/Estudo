package pojetoPedidos.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pojetoPedidos.domain.entity.User;

/**
Interface responsavel por fazer a conexão entre minha camada de serviço no caso com o DB
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
