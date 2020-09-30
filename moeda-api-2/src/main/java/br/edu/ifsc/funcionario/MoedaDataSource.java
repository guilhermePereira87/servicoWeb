package br.edu.ifsc.funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class MoedaDataSource {
	private static List<Moeda> listaMoedas = new ArrayList<>();
	
	public static void criarLista() {
		listaMoedas.add(new Moeda("Dólar Comercial", "DC", 5.6061, 5.6066));
		listaMoedas.add(new Moeda("Dólar paralelo", "DP", 5.69, 5.79));
		listaMoedas.add(new Moeda("Dólar PTAX", "DX", 5.6058, 5.6064));
		listaMoedas.add(new Moeda("Dólar Turismo", "DT", 5.5430, 5.7530));
		listaMoedas.add(new Moeda("EURO", "EU", 6.5630, 6.8070));
		listaMoedas.add(new Moeda("OURO", "OU", 346.70, 1.88));		
	}
	
	public static Moeda get(String sigla) {
		for (Moeda moeda: listaMoedas) {
			if (moeda.getSigla().equalsIgnoreCase(sigla)) {
			    return moeda;
			}
		}
		return null;
	}
	
	public static Moeda comparaMoeda(String sigla) {
		for(Moeda moeda : listaMoedas) {
			if(moeda.getSigla().equalsIgnoreCase(sigla)) { 
				return moeda;
			}
		}
		return null;
	}
	
	public static List<Moeda> getAll() {
		return listaMoedas;
	}
	
	private static double calcularPrecoVendaOuro(Moeda moeda) {
		double precoVendaOuro = moeda.getValorCompra() + 
				(moeda.getValorCompra() * moeda.getValorVenda() / 100);
		return precoVendaOuro;
	}
	
	public static Double retornaCotacao(double valor,String tipo,String operacao ) {
		Moeda moeda = comparaMoeda(tipo);
		
		Double cotacao = 0.0;
		if(moeda != null) {
			if (operacao.equalsIgnoreCase("venda")) {
				if (!tipo.equalsIgnoreCase("OU")) {
					cotacao = valor / moeda.getValorVenda();
				} else {
					cotacao = valor / calcularPrecoVendaOuro(moeda);
				}
			}else {
				cotacao = valor * moeda.getValorCompra();
			}
		}
		
		BigDecimal d = new BigDecimal(cotacao).setScale(2, RoundingMode.HALF_EVEN); //formata o numero 
		return d.doubleValue();
	}
	

	
}