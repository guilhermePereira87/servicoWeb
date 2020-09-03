package br.edu.ifsc.funcionarios;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDataSource {
	
	private static List<Funcionario> listaFuncionario = new ArrayList<>();
	
	public static void criarLista() {
		listaFuncionario.add(new Funcionario(1, "Marcos", 1300.00, 3));
		listaFuncionario.add(new Funcionario(2, "Marcela", 3200.00, 0));
		listaFuncionario.add(new Funcionario(3, "Fernando", 4300.00, 2));
		listaFuncionario.add(new Funcionario(4, "Paola", 2300.00, 4));
		listaFuncionario.add(new Funcionario(5, "Silverio", 1950.00, 1));
	}

	public static List<Funcionario> getListaFuncionario() {
		
		return listaFuncionario;
	}
	
	public static void novo(Funcionario funcionario) {
		listaFuncionario.add(funcionario);
	}
}
