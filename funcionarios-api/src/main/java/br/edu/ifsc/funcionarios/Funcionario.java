package br.edu.ifsc.funcionarios;

public class Funcionario {
	
	private int matricula;
	private String nome;
	private Double salarioBase;
	private int numeroDependentes;
	
	
	public Funcionario(int matricula, String nome, Double salarioBase, int numeroDependentes) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.numeroDependentes = numeroDependentes;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public int getNumeroDependentes() {
		return numeroDependentes;
	}


	public void setNumeroDependentes(int numeroDependentes) {
		this.numeroDependentes = numeroDependentes;
	}
	
	public double calcularSalario() {
		if(salarioBase>=8500) {	
			double x = salarioBase - (0.275*salarioBase) + (numeroDependentes * 150); 
				return x;
			}
			else if(salarioBase>5000 & salarioBase<8500) {
				double x = salarioBase - (0.15*salarioBase) + (numeroDependentes * 150);
				return x;
			}
			else {
				double x = salarioBase + (numeroDependentes * 150);
				return x;
			}
	}
}
