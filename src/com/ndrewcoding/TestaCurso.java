package com.ndrewcoding;

public class TestaCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Silveira");

        javaColecoes.adicionar(new Aula("Trabalhando com ArrayList", 23));
        javaColecoes.adicionar(new Aula("Criando uma Aula", 15));
        javaColecoes.adicionar(new Aula("Modelando com Coleções", 21));

        System.out.println(javaColecoes.getAulas());

    }
}
