package aluas.demo.ZZKjunit.verificaIdade.service;

import aluas.demo.ZZKjunit.verificaIdade.dominio.Person;

import java.util.List;
import java.util.stream.Collectors;


public class PersonService {

    public boolean isAdult(Person person){
//        Objects.requireNonNull(person, "Person can't not be null");
        if(person == null){
            throw new NullPointerException();
        }
        return person.getAge() >= 18;
    }

    public List<Person> filterRemovingNotAdult(List<Person> personList){
        return personList.stream().filter(this::isAdult).collect(Collectors.toList());
    }

}
