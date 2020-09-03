package br.edu.ifsc.funcionarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FuncionarioApiApplication {

	public static void main(String[] args) {
		
		FuncionarioDataSource.criarLista();
		
		SpringApplication.run(FuncionarioApiApplication.class, args);
	}

}
