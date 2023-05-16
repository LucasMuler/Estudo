package pojetoPedidos.domain.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojetoPedidos.domain.entity.User;

/**
 * Controlador iniciado a partir da url: localhost:8081/users
 */
@RestController
@RequestMapping(value = "/users")
public class UserResource {

    /**
     * Requisição do tipo get que retorna um response Entity
     * @return
     */
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Maria", "maria@gmail.com", "9999999", "12345");
        return ResponseEntity.ok().body(u);
    }

}
