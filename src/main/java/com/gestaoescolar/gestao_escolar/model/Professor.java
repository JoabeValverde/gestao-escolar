package com.gestaoescolar.gestao_escolar.model;

public class Professor extends Funcionarios{
    private String disciplina;
    private String turma;

    public Professor(Integer id, String nome, String cargo) {
        super(id, nome, cargo);
    }
}
