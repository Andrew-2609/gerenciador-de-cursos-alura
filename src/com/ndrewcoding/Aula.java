package com.ndrewcoding;

public class Aula {

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

}
