package com.ndrewcoding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("WhileLoopReplaceableByForEach")
public class TestandoIterator {
    public static void main(String[] args) {

        List<String> letras = new ArrayList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");
        letras.add("E");

        Iterator<String> iterator = letras.iterator();
        while (iterator.hasNext()) {
            String proximaLetra = iterator.next();
            System.out.println(proximaLetra);
        }

    }
}
