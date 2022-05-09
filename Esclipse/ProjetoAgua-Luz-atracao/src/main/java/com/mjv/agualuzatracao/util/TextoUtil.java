package com.mjv.agualuzatracao.util;

public class TextoUtil {
	public static String removerNaoNumericos(String texto) {
		return texto.replaceAll("\\D", "");
	}
	public static String completarZero(String numString, int tamanhoMaximo) {
		Long numero = Long.valueOf(numString);
		String formato = "%0" + tamanhoMaximo + "d";
		String textoFormatado = String.format(formato, numero);
		return textoFormatado;
	}
	public static String ajustarTamanho(String textoOrigianal, int tamanhoMaximo) {
		String textoAjustado;
		String formato = "%-" + tamanhoMaximo + "s";
		if (textoOrigianal.length() >= tamanhoMaximo) { 
			textoAjustado = textoOrigianal.substring(0, tamanhoMaximo);
			return textoAjustado;
		}
		else {
			textoAjustado = String.format(formato, textoOrigianal);
			return textoAjustado;
		}
	}
}
