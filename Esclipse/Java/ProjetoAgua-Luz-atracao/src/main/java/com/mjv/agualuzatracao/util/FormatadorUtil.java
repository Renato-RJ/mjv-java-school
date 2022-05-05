package com.mjv.agualuzatracao.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatadorUtil{

	public static String formatarCpf(String cpf) {
		String part1 = cpf.substring(0, 3);
		String part2 = cpf.substring(3, 6);
		String part3 = cpf.substring(6, 9);
		String part4 = cpf.substring(9, 11);
		String cpfFormatador = String.format("%s.%s.%s-%s", part1, part2, part3, part4);
		return cpfFormatador;
	}
	public static String formatarData(LocalDate data) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String dataFormatada = data.format(formatter);	
		return dataFormatada;
	}
	public static String formatarTime(LocalTime hora) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
			String horaFormatada = hora.format(formatter);	
		return horaFormatada;
	}
	public static String padronizarTamanho(String palavra, Integer tamanhoMaximo) {
		String itemPadronizado = "";
		if (palavra.length() <=tamanhoMaximo) {
			String formato = "%-" + tamanhoMaximo + "s";
			itemPadronizado = String.format(formato, palavra);
			}
		else {
			itemPadronizado = palavra.substring(0, tamanhoMaximo);
		}
		return itemPadronizado;
	}
}