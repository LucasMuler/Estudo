package pojetoPedidos.domain.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pojetoPedidos.domain.entity.Order;
import pojetoPedidos.domain.entity.OrderStatus;
import pojetoPedidos.domain.entity.User;
import pojetoPedidos.domain.repository.OrderRepository;
import pojetoPedidos.domain.repository.UserRepository;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    /**
     * Este método é criado a partir do CommandLineRunner, onde é realizado a execução do mesmo
     * todas às vezes que o programa é iniciado
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null,"Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null,"Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);

        userRepository.saveAll(Arrays.asList(u1,u2)); // cria uma lista para poder salvar
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));

    }
}
