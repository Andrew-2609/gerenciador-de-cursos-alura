package com.ndrewcoding;

public class Aula implements Comparable<Aula> {

    private String titulo;
    private int duracao;

    public Aula(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public int compareTo(Aula aula) {
        return this.titulo.compareTo(aula.getTitulo());
    }

    @Override
    public String toString() {
        return "Aula(" + "título: " + this.titulo + ", duração: " + this.duracao + ")";
    }

}
