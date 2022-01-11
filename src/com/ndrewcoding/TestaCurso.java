package com.ndrewcoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Silveira");

        javaColecoes.adicionar(new Aula("Trabalhando com ArrayList", 23));
        javaColecoes.adicionar(new Aula("Criando uma Aula", 15));
        javaColecoes.adicionar(new Aula("Modelando com Coleções", 21));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulasMutaveis);

        System.out.println("Exibindo aulas ordenadas:\n" + aulasMutaveis);
        System.out.println("Duração total do curso: " + javaColecoes.getTempoTotal() + " minutos.");

    }
}
