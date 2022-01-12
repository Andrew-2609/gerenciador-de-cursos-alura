package com.ndrewcoding;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {

        Curso alemaoA1 = new Curso("Deutschkurs A1 für Anfänger", "Alexander Müller");

        alemaoA1.adicionar(new Aula("Personalpronomen", 23));
        alemaoA1.adicionar(new Aula("Vokabular Eins", 15));
        alemaoA1.adicionar(new Aula("Verben", 22));

        Aluno primeiroAluno = new Aluno("Andrew Monteiro", 1);
        Aluno segundoAluno = new Aluno("Carlos Alberto", 2);
        Aluno terceiroAluno = new Aluno("Beto Carneiro", 3);

        alemaoA1.matricular(primeiroAluno);
        alemaoA1.matricular(segundoAluno);
        alemaoA1.matricular(terceiroAluno);

    }
}
