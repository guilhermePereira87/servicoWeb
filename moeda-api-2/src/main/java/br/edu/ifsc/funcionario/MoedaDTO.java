package br.edu.ifsc.funcionario;

public class MoedaDTO {

	private Double valor;
	private String operacao;
	private Double dc;
	private Double dx;
	private Double dt;
	private Double eu;
	private Double ou;
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public Double getDc() {
		return dc;
	}
	public void setDc(Double dc) {
		this.dc = dc;
	}
	public Double getDx() {
		return dx;
	}
	public void setDx(Double dx) {
		this.dx = dx;
	}
	public Double getDt() {
		return dt;
	}
	public void setDt(Double dt) {
		this.dt = dt;
	}
	public Double getEu() {
		return eu;
	}
	public void setEu(Double eu) {
		this.eu = eu;
	}
	public Double getOu() {
		return ou;
	}
	public void setOu(Double ou) {
		this.ou = ou;
	}
	public MoedaDTO(Double valor, String operacao, Double dc, Double dx, Double dt, Double eu, Double ou) {
		super();
		this.valor = valor;
		this.operacao = operacao;
		this.dc = dc;
		this.dx = dx;
		this.dt = dt;
		this.eu = eu;
		this.ou = ou;
	}
	
	
	
}
