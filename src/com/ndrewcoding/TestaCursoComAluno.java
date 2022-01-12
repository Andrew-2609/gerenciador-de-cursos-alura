package com.ndrewcoding;

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

        javaColecoes.getAlunos().forEach(System.out::println);

        System.out.println("O aluno " + terceiroAluno.getNome() + " está matriculado? " + javaColecoes.estaMatriculado(terceiroAluno));

    }
}
