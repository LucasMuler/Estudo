package aluas.demo.ZZKjunit.service;

import aluas.demo.ZZKjunit.dominio.Person;
import org.springframework.stereotype.Service;

import java.util.Objects;


public class PersonService {

    public boolean isAdult(Person person){
        Objects.requireNonNull(person, "Person can't not be null");
        return person.getAge() >= 18;
    }

}
