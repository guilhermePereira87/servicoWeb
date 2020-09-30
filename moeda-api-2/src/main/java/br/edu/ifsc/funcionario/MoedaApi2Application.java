package br.edu.ifsc.funcionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoedaApi2Application {

	public static void main(String[] args) {
		MoedaDataSource.criarLista();
		SpringApplication.run(MoedaApi2Application.class, args);
	}

}
