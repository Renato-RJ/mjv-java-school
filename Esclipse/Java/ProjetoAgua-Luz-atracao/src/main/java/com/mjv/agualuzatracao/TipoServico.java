package com.mjv.agualuzatracao;

public enum TipoServico {
	AGUA	("A"),
	LUZ 	("L");
	
	private String sigla;
		private TipoServico(String sigla){
		this.sigla = sigla;
		}
	public String getSigla() {
		return sigla;
	}
}