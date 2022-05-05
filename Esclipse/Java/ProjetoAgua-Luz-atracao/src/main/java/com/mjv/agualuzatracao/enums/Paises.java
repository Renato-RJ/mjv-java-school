package com.mjv.agualuzatracao.enums;

public enum Paises {
	ESPANHA	("ES"),
	CANADA ("CA"),
	BRASIL ("BR");
	
	private String sigla;
		private Paises(String sigla){
		this.sigla = sigla;
		}
	public String getSigla() {
		return sigla;
	}
}