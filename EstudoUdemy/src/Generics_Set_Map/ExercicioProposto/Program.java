package Generics_Set_Map.ExercicioProposto;

import Generics_Set_Map.ExercicioProposto.Entities.Aluno;
import Generics_Set_Map.ExercicioProposto.Entities.Courses;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Aluno> listaAlunos = new HashSet<>();

        System.out.print("quantos cursos voce tem?");
        int quantidadeCursos = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < quantidadeCursos; i++){

            System.out.print("Qual o nome do curso ?");
            Courses c = new Courses(sc.nextLine());

            System.out.print("quantos estudantes voce tem no curso " + c.getName()+"?");
            int quantAlunos = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < quantAlunos;j++){
                System.out.println("Insira os IDs do aluno " + (j+1));
                int idAluno = sc.nextInt();
                sc.nextLine();

                Aluno a = new Aluno(idAluno);
                listaAlunos.add(a);
            }
        }

        System.out.println("Total students: " + listaAlunos.size());

        sc.close();
    }
}
