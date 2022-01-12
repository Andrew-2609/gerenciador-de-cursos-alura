package com.ndrewcoding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("WhileLoopReplaceableByForEach")
public class TestandoIteratorDeMap {
    public static void main(String[] args) {

        Map<Integer, String> jogadoresDeBasquete = new HashMap<>();
        jogadoresDeBasquete.put(1, "Michael Jordan");
        jogadoresDeBasquete.put(2, "Kobe Bryant");
        jogadoresDeBasquete.put(3, "LeBron James");
        jogadoresDeBasquete.put(4, "Tim Duncan");

        Set<Integer> keys = jogadoresDeBasquete.keySet();

        System.out.println("-- Usando forEach --");

        keys.forEach(index -> System.out.println(jogadoresDeBasquete.get(index)));

        System.out.println("\n-- Usando Iterator<Integer> --");

        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String jogador = jogadoresDeBasquete.get(iterator.next());
            System.out.println(jogador);
        }

    }
}
