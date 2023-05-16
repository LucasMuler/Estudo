package pojetoPedidos.domain.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pojetoPedidos.domain.entity.User;
import pojetoPedidos.domain.repository.UserRepository;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    /**
     * Este método é criado a partir do CommandLineRunner, onde é realizado a execução do mesmo
     * todas às vezes que o programa é iniciado
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        repository.saveAll(Arrays.asList(u1,u2)); // cria uma lista para poder salvar

    }
}
