package com.ndrewcoding;

public class Aluno {

    private String nome;
    private int numeroDeMatricula;

    public Aluno(String nome, int numeroDeMatricula) {
        this.nome = nome;
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Aluno && nome.equals(((Aluno) obj).getNome()) && numeroDeMatricula == ((Aluno) obj).getNumeroDeMatricula();
    }

    @Override
    public String toString() {
        return "Aluno(nome: " + nome + ", numero de matricula: " + numeroDeMatricula + ")";
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

}
