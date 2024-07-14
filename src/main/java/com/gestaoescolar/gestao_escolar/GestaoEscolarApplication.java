package com.gestaoescolar.gestao_escolar;

import com.gestaoescolar.gestao_escolar.service.ServicosDosFuncionarios;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestaoEscolarApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoEscolarApplication.class, args);
	}
	ServicosDosFuncionarios servicosDosFuncionarios = new ServicosDosFuncionarios();

	//adicionando funcionarios




}
