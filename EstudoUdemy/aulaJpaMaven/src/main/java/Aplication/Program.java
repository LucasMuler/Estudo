package Aplication;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(0, "Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(0, "Joaquim Torres", "joaquim@gmail.com");
        Pessoa p3 = new Pessoa(0, "Ana Maria", "ana@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.println("pronto");
    }
}