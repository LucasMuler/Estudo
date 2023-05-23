package aluas.demo.ZZKjunit.service;

import aluas.demo.ZZKjunit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    private Person adult;
    private Person notAdult;
    private PersonService personService;

    @BeforeEach
    public void setUp() {
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();
    }


    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult_ReturnFase_WhenAgeIsLowerThen18() {
        Assertions.assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be adult when age is greater or equal than 18")
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualsThan18() {
        Assertions.assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException with message when person is null")
    void isAdult_ReturnException_WhenPersonIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> personService.isAdult(null), "Person can't");
    }

    @Test
    @DisplayName("Should return list whit only adult")
    void filterRemovingAdult_ReturnList_WhitOnlyAdult() {
        List<Person> personList = List.of(new Person(17), new Person(18), new Person(21));
        Assertions.assertEquals(2, personService.filterRemovingNotAdult(personList).size());
    }
}