package pojetoPedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pojetoPedidos.domain.entity.User;
import pojetoPedidos.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    /**
     * Quando receber uma requisição do tipo post sem id, teremos uma listagem de todos os itens
     * a partir desta forma, ele busca no meu banco de dados uma lista.
     * @return
     */
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }

    /**
     * Quando recebmos uma requisição do tipo get para a url referenciando um ID, teremos a execução
     * deste bloco, porem foi feito o mesmo sem utilizar optional, acontece um erro estranho que acredito
     * que aconteça por conta do H2 ou algo relacionado
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findById(id));
    }

}
