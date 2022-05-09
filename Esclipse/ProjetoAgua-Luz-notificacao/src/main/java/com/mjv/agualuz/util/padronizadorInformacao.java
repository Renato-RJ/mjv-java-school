package com.mjv.agualuz.util;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class padronizadorInformacao {
	public static String formatarCpf(String cpf) {
		String part1 = cpf.substring(0,3);
		String part2= cpf.substring(3,6);
		String part3= cpf.substring(6,9);
		String part4= cpf.substring(9,11);
		String cpfFormatado=String.format("%s.%s.%s-%s", part1, part2, part3, part4);
		return cpfFormatado;
	}
	public static String formatarValor (String valor) {
		NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado = formato.format(11234.56);
		System.out.println(valorFormatado);
		return valorFormatado;
		
	}
	public static String formatarData(String dataString) {
		String ano = dataString.substring(0 , 4);
		String mes = dataString.substring(4, 6);
		String dia = dataString.substring(6, 8);
		LocalDate data = LocalDate.parse(ano+"-"+mes+"-"+dia); 
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = data.format(formatoData);
		return dataFormatada;
	}
	
}