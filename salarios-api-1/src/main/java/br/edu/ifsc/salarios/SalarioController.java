package br.edu.ifsc.salarios;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SalarioController {
	
	@RequestMapping(value="/salario_liquido/{salBruto}", method = RequestMethod.GET)
	public Double calcularLiquido(
			@PathVariable("salBruto") Double salBruto ){
			Double salarioLiquido = salBruto - ) - 
			return salarioLiquido;
		
		}
	
	@RequestMapping(value = "/relatorio/{salBruto}"), method = RequestMethod.GET)
	public Salario criarSalario
			
		
	

}
