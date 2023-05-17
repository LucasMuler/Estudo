package pojetoPedidos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojetoPedidos.domain.entity.Order;
import pojetoPedidos.domain.repository.OrderRepository;

import java.util.List;
import java.util.Optional;


@Service //normalmente é utilizado o @Component
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Optional<Order> findById(Long id) {
        return repository.findById(id);
    }
}
