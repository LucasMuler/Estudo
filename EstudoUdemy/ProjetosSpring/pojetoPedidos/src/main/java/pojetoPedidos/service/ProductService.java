package pojetoPedidos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojetoPedidos.domain.entity.Product;
import pojetoPedidos.domain.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> listAll(){
        return repository.findAll();
    }

    public Optional<Product> findById(Long id){
        return repository.findById(id);
    }
}
