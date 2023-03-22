package Generics_Set_Map.ExercicioProposto.Entities;

import Exercicios.ExMedia.Entities.Aluno;

import java.util.HashSet;
import java.util.Set;

public class Courses {

    private String name;

    Set<Aluno> listaAlunosCurso = new HashSet<>();

    public Courses(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Aluno> getListaAlunosCurso() {
        return listaAlunosCurso;
    }
}
