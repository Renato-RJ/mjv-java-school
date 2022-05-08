package com.mjv.agualuzatracao.util;

import com.mjv.agualuzatracao.model.Cliente;

public class FormatarCsv {
	public String FormatarCsv (Cliente cliente){
		StringBuilder csv = new StringBuilder();
				
		csv.append(String.format("%011d", Long.valueOf(cliente.getCpf().replaceAll("\\D","")))+";");
		csv.append(String.format("%010d", Long.valueOf(cliente.getRg().replaceAll("\\D","")))+";");
		String nome = cliente.getNome();
			if (nome.length() >=30)
				csv.append(nome.substring(0, 30).toUpperCase()+";");
			else 
				csv.append(String.format("%-30s", nome.toUpperCase())+";");
		csv.append(String.format("%011d", Long.valueOf(cliente.getTel().replaceAll("\\D","")))+";");
		String logradouro = cliente.getLogradouro();
			if (logradouro.length() >=20)
				csv.append(logradouro.substring(0, 20).toUpperCase()+";");
			else 
				csv.append(String.format("%-20s", logradouro.toUpperCase())+";");
		csv.append(String.format("%06d", Long.valueOf(cliente.getNumEnd()))+";");
		String complemento = cliente.getComplemento();
			if (complemento.length() >=10)
				csv.append(complemento.substring(0, 10).toUpperCase()+";");
			else 
				csv.append(String.format("%-10s", logradouro.toUpperCase())+";");
		String bairro = cliente.getBairro();
			if (bairro.length() >=15)
				csv.append(bairro.substring(0, 15).toUpperCase()+";");
			else 
				csv.append(String.format("%-15s", bairro.toUpperCase())+";");
		String cidade = cliente.getCidade();
			if (cidade.length() >=30)
				csv.append(cidade.substring(0, 30).toUpperCase()+";");
			else 
				csv.append(String.format("%-30s", cidade.toUpperCase())+";");
		String uf = cliente.getUf();
			if (uf.length() >=2)
				csv.append(uf.substring(0, 2).toUpperCase()+";");
			else 
				csv.append(String.format("%-2s", uf.toUpperCase())+";");
		csv.append(String.format("%08d", Long.valueOf(cliente.getCep().replaceAll("\\D","")))+";");
		csv.append(cliente.getPais().getSigla()+";");
		csv.append(String.format("%010d", Long.valueOf(cliente.getProtocolo()))+";");
		csv.append(cliente.getData().toString().replaceAll("\\D","")+";");
		csv.append(cliente.getHora().toString().replaceAll("\\D","")+";");
		csv.append(cliente.getTipoServico().getSigla()+";");
		csv.append(String.valueOf(cliente.getValor()).replaceAll("\\D","")+";");
		csv.append(cliente.getTipoNotificacao().getSigla());
		
		return csv.toString();
	}


}
