package pojetoPedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojetoPedidos.domain.entity.User;
import pojetoPedidos.service.UserService;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

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

}
