package br.edu.ifsc.salarios;

public class Salarios { 
	
	private Double salBruto;
	private Double irpf;
	private Double inss;
	
	public Salarios(Double salBase, Double irpf, Double inss) {
		super();
		this.salBruto = salBruto;
		this.irpf = irpf;
		this.inss = inss;
	}

	public Double getSalBruto() {
		return salBruto;
	}

	public void setSalBruto(Double salBruto) {
		this.salBruto = salBruto;
	}

	public Double getIrpf() {
		return irpf;
	}

	public void setIrpf(Double irpf) {
		this.irpf = irpf;
	}

	public Double getInss() {
		return inss;
	}

	public void setInss(Double inss) {
		this.inss = inss;
	}	
	
	public Double calcularIrpf(){
		if(salBruto>=4664.68) {
			irpf = (salBruto * 0.275) - 869.36;
			return irpf;
		} if(salBruto<4664.68 && salBruto>3751.06) {
			irpf = (salBruto * 0.225) - 636.13;
			return irpf;
		} if(salBruto<3751.05 && salBruto>2826.66) {
			irpf = (salBruto * 0.15) - 354.80;
			return irpf;
		} else {
			irpf = 0.0;
			return irpf;
		}
	}
	public Double calcularInss(){
		if(salBruto>=3134.41) {
			inss = (salBruto * 0.14);
			return inss;
		} if(salBruto<3134.40 && salBruto>2089.61) {
			inss = (salBruto * 0.12);
			return inss;
		} if(salBruto<2089.60 && salBruto<1045.01) {
			inss = (salBruto * 0.09);
			return inss;
		} else {
			inss = (salBruto * 0.075);
			return inss;
		}
	}
	
}
	
	
