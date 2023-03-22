package Generics_Set_Map.ExercicioResolvido.Entities;

import java.time.LocalDate;
import java.util.Objects;

public class Usuarios {

    private String nome;
    private LocalDate data;

    public Usuarios(String nome, LocalDate data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuarios usuarios = (Usuarios) o;
        return Objects.equals(nome, usuarios.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
