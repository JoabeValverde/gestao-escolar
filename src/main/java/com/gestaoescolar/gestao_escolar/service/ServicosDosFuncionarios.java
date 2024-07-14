package com.gestaoescolar.gestao_escolar.service;

import com.gestaoescolar.gestao_escolar.model.Funcionarios;

import java.util.ArrayList;
import java.util.List;

public class ServicosDosFuncionarios {

    private List<Funcionarios> funcionarios; //lista para armazenar os funcionarios

    //construtor que inicia a lista de funcionarios


    public ServicosDosFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }
    //metodo para adicionar um novo funcionario

    public void addFuncionario(Funcionarios funcionarios){
        funcionarios.add(funcionarios);
    }

    //metodo par atualizar informacoes de funcionarios existentes
    public void atualizarFuncionaarios(Integer id, String nome, String cargo){
        for (Funcionarios funcionarios : funcionarios){
            if (funcionarios.getId()==id){
                funcionarios.setNome(nome);
                funcionarios.setCargo(cargo);
                break;
            }
        }
    }

    //metodo para listar todos os funcionarios
    public List<Funcionarios> getAllFuncionarios(){
        return funcionarios;
    }


    //metodo para excluir um funcionario com base no ID
    public void deleteFuncionarios(Integer id){
        funcionarios.removeIf(funcionarios -> funcionarios.getId()==id );
    }
}
