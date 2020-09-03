package br.edu.ifsc.funcionarios;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDataSource {
	
	private static List<Funcionario> listaFuncionario = new ArrayList<>();
	
	public static void criarLista() {
		listaFuncionario.add(new Funcionario(20201, "Marcos", 1300.00, 3));
		listaFuncionario.add(new Funcionario(20202, "Marcela", 3200.00, 0));
		listaFuncionario.add(new Funcionario(20203, "Fernando", 4300.00, 2));
		listaFuncionario.add(new Funcionario(20191, "Paola", 2300.00, 4));
		listaFuncionario.add(new Funcionario(20192, "Silverio", 1950.00, 1));
	}

	public static List<Funcionario> getListaFuncionario() {
		
		return listaFuncionario;
	}
	
	public static void novo(Funcionario funcionario) {
		listaFuncionario.add(funcionario);
	}
	
	public static Funcionario pesquisarPorMatricula(int id) {
		for(Funcionario funcionario : listaFuncionario) {
			if(funcionario.getMatricula() == id) {
				return funcionario;
			}
		}
		
		return null;
	}
	
}
