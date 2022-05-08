package com.mjv.agualuzatracao.model;

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