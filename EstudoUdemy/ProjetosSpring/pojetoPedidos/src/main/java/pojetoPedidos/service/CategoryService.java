package pojetoPedidos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojetoPedidos.domain.entity.Category;
import pojetoPedidos.domain.repository.CategoryRepository;

import java.util.List;
import java.util.Optional;


@Service //normalmente é utilizado o @Component
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Optional<Category> findById(Long id) {
        return repository.findById(id);
    }
}
