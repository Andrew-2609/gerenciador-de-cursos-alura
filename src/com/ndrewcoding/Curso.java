package com.ndrewcoding;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adicionar(Aula aula) {
        aulas.add(aula);
    }

    public void matricular(Aluno aluno) {
        alunos.add(aluno);
        matriculaParaAluno.put(aluno.getNumeroDeMatricula(), aluno);
    }

    public int getDuracaoTotal() {
        return aulas.stream().mapToInt(Aula::getDuracao).sum();
    }

    public boolean estaMatriculado(Aluno aluno) {
        return alunos.contains(aluno);
    }

    public Aluno buscarPorMatricula(int matricula) {
        if (!matriculaParaAluno.containsKey(matricula))
            throw new NoSuchElementException("Não há nenhum aluno com a matrícula: " + matricula);
        return matriculaParaAluno.get(matricula);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    @Override
    public String toString() {
        return "Curso(nome: " + nome + ", instrutor: " + instrutor + ", aulas: " + aulas.size() + ")";
    }

}
