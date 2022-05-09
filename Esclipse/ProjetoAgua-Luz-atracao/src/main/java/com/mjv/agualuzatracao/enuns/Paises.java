package com.mjv.agualuzatracao.enuns;

public enum Paises {
	Espanha	("ES"),
	Canada ("CA"),
	Brasil ("BR");
	
	private String sigla;
		private Paises(String sigla){
		this.sigla = sigla;
		}
	public String getSigla() {
		return sigla;
	}
}