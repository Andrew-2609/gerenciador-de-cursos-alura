package com.ndrewcoding;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Silveira");

        javaColecoes.adicionar(new Aula("Trabalhando com ArrayList", 23));
        javaColecoes.adicionar(new Aula("Criando uma Aula", 15));
        javaColecoes.adicionar(new Aula("Modelando com Coleções", 21));

        Aluno primeiroAluno = new Aluno("Andrew Monteiro", 1);
        Aluno segundoAluno = new Aluno("Carlos Alberto", 2);
        Aluno terceiroAluno = new Aluno("Beto Carneiro", 3);

        javaColecoes.matricular(primeiroAluno);
        javaColecoes.matricular(segundoAluno);
        // javaColecoes.matricular(terceiroAluno);

        /*javaColecoes.getAlunos().forEach(System.out::println);*/

        // Legacy code
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();
        //noinspection WhileLoopReplaceableByForEach
        while (iterator.hasNext()) {
            Aluno proximoAluno = iterator.next();
            System.out.println(proximoAluno);
        }

        System.out.println("O aluno " + terceiroAluno.getNome() + " está matriculado? " + javaColecoes.estaMatriculado(terceiroAluno));

        System.out.println("\n---Testando equals() e hashcode()---");
        System.out.println("O primeiro aluno é igual ao novo objeto Aluno criado?");
        System.out.println(primeiroAluno.equals(new Aluno("Andrew Monteiro", 1)));
        System.out.println("O novo objeto Aluno está contido no Set?");
        System.out.println(javaColecoes.getAlunos().contains(new Aluno("Andrew Monteiro", 1)));
        System.out.println("Hash code do:");
        System.out.println("- primeiroAluno: " + primeiroAluno.hashCode());
        System.out.println("- novo objeto Aluno: " + new Aluno("Andrew Monteiro", 1).hashCode());

    }
}
