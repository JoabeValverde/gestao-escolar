package com.gestaoescolar.gestao_escolar.model;

public class EquipeAdministrativa extends Funcionarios{
    private String departamento;
    private String responsabilidade;

    public EquipeAdministrativa(Integer id, String nome, String cargo) {
        super(id, nome, cargo);
    }
}
