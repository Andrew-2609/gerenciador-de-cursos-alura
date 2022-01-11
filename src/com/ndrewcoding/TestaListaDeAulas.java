package com.ndrewcoding;

import java.util.ArrayList;
import java.util.Collections;

public class TestaListaDeAulas {
    public static void main(String[] args) {

        Aula primeiraAula = new Aula("Revisitando as ArrayLists", 21);
        Aula segundaAula = new Aula("Listas de Objetos", 15);
        Aula terceiraAula = new Aula("Relacionamentos de Listas e Objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(primeiraAula);
        aulas.add(segundaAula);
        aulas.add(terceiraAula);

        aulas.forEach(System.out::println);

        Collections.sort(aulas);
        System.out.println("--Após ordenar por *título*--");

        aulas.forEach(System.out::println);

    }
}
