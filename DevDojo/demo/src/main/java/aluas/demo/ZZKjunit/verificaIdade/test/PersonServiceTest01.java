package aluas.demo.ZZKjunit.verificaIdade.test;

import aluas.demo.ZZKjunit.verificaIdade.dominio.Person;
import aluas.demo.ZZKjunit.verificaIdade.service.PersonService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonServiceTest01 {
    public static void main(String[] args) {

        Person person = new Person(18);
        PersonService personService = new PersonService();
        log.info("Is adult? '{}'", personService.isAdult(person));

    }
}
