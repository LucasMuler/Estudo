package pojetoPedidos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojetoPedidos.domain.entity.User;
import pojetoPedidos.domain.repository.UserRepository;

import java.util.List;
import java.util.Optional;


@Service //normalmente é utilizado o @Component
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }
}
