package com.mjv.agualuz;

public enum Paises {
	Espanha	("ES"),
	Canad� ("CA"),
	Brasil ("BR");
	
	private String sigla;
		private Paises(String sigla){
		this.sigla = sigla;
		}
	public String getSigla() {
		return sigla;
	}
}