package br.edu.ifsc.funcionarios;


import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class FuncionarioController {
	
	
	@RequestMapping(value="/novoFuncionario/{matricula}/{nome}/{salarioBase}/{dependentes}")
	public Funcionario criarFuncionario(
			@PathVariable("matricula") int matricula,
			@PathVariable("nome") String nome,
			@PathVariable("salarioBase") Double salarioBase,
			@PathVariable("dependentes") int dependentes) {
		
		Funcionario funcionario = new Funcionario(matricula, nome, salarioBase, dependentes);
		
		FuncionarioDataSource.novo(funcionario);
		
		return funcionario;
	}
	
	@RequestMapping(value="/funcionario")
	public List<Funcionario> getFuncionario(){
		return FuncionarioDataSource.getListaFuncionario();
	}
	
	@RequestMapping(value="/buscar/{matricula}")
	public Funcionario buscarFuncionario(
			@PathVariable("matricula") int matricula) {
		return FuncionarioDataSource.pesquisarPorMatricula(matricula);		
	}
	
	
	@RequestMapping(value="/salario/{idx}")
	public double buscarSalario(
			@PathVariable("idx") int idx) {
		Funcionario funcionario = FuncionarioDataSource.getListaFuncionario().get(idx);
		return funcionario.calcularSalario();		
	}
	
	
	
}
