package br.edu.ifsc.calculadora;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculadoraController {
	
	//notations for orientation to framework Spring Boot
	
	@RequestMapping(value = "/somar/{valor1}/{valor2}", method = RequestMethod.GET)
	public Double somar(
			@PathVariable("valor1") Double valor1, 
			@PathVariable("valor2") Double valor2) {
		return valor1 + valor2;
	}
	
	@RequestMapping(value = "/subtrair/{valor1}/{valor2}", method = RequestMethod.GET)
	public Double subtrair(@PathVariable("valor1") Double valor1, 
			@PathVariable("valor2") Double valor2) {
		return valor1 - valor2;
	}
	
	@RequestMapping(value = "/media/{valor1}/{valor2}/{valor3}", method = RequestMethod.GET)
	public Double media(
			@PathVariable("valor1") Double valor1, 
			@PathVariable("valor2") Double valor2, 
			@PathVariable("valor3") Double valor3) {
		return (valor1 + valor2 + valor3)/3;	
	}
	

}
