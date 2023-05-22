package aluas.demo.ZZKjunit.service;

import aluas.demo.ZZKjunit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult_ReturnFase_WhenAgeIsLowerThen18() {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        Assertions.assertEquals(false, personService.isAdult(person));
    }
}