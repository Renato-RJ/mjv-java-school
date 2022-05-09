package com.mjv.agualuzatracao.util;

import com.mjv.agualuzatracao.model.Cliente;
import com.mjv.agualuzatracao.model.Contrato;
import com.mjv.agualuzatracao.model.Endereco;

public class FormatarCsv {
	public String FormatarCsv (Contrato contrato){
		StringBuilder csv = new StringBuilder();
		Cliente cliente = contrato.getCliente();
		Endereco endereco = contrato.getCliente().getEndereco();
		
				
		csv.append(String.format("%011d", Long.valueOf(cliente.getCpf().replaceAll("\\D","")))+";");
		csv.append(String.format("%010d", Long.valueOf(cliente.getRg().replaceAll("\\D","")))+";");
		String nome = cliente.getNome();
			if (nome.length() >=30)
				csv.append(nome.substring(0, 30).toUpperCase()+";");
			else 
				csv.append(String.format("%-30s", nome.toUpperCase())+";");
		csv.append(String.format("%011d", Long.valueOf(cliente.getTel().replaceAll("\\D","")))+";");
		String logradouro = endereco.getLogradouro();
			if (logradouro.length() >=20)
				csv.append(logradouro.substring(0, 20).toUpperCase()+";");
			else 
				csv.append(String.format("%-20s", logradouro.toUpperCase())+";");
		csv.append(String.format("%06d", Long.valueOf(endereco.getNumEndereco()))+";");
		String complemento = endereco.getComplemento();
			if (complemento.length() >=10)
				csv.append(complemento.substring(0, 10).toUpperCase()+";");
			else 
				csv.append(String.format("%-10s", logradouro.toUpperCase())+";");
		String bairro = endereco.getBairro();
			if (bairro.length() >=15)
				csv.append(bairro.substring(0, 15).toUpperCase()+";");
			else 
				csv.append(String.format("%-15s", bairro.toUpperCase())+";");
		String cidade = endereco.getCidade();
			if (cidade.length() >=30)
				csv.append(cidade.substring(0, 30).toUpperCase()+";");
			else 
				csv.append(String.format("%-30s", cidade.toUpperCase())+";");
		String uf = endereco.getUf();
			if (uf.length() >=2)
				csv.append(uf.substring(0, 2).toUpperCase()+";");
			else 
				csv.append(String.format("%-2s", uf.toUpperCase())+";");
		csv.append(String.format("%08d", Long.valueOf(endereco.getCep().replaceAll("\\D","")))+";");
		csv.append(endereco.getPais().getSigla()+";");
		csv.append(String.format("%010d", Long.valueOf(contrato.getProtocolo()))+";");
		csv.append(contrato.getData().toString().replaceAll("\\D","")+";");
		csv.append(contrato.getHora().toString().replaceAll("\\D","")+";");
		csv.append(contrato.getTipoServico().getSigla()+";");
		csv.append(String.valueOf(contrato.getValor()).replaceAll("\\D","")+";");
		csv.append(contrato.getTipoNotificacao().getSigla());
		
		return csv.toString();
	}


}
