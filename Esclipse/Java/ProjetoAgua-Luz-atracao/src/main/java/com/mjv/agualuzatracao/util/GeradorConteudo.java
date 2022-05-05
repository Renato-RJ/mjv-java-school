
package com.mjv.agualuzatracao.util;

import java.util.Locale;

import com.mjv.agualuzatracao.model.Cadastro;
import com.mjv.agualuzatracao.model.Contrato;
import com.mjv.agualuzatracao.model.Endereco;

public class GeradorConteudo {
	public String gerarDados (Cadastro cliente){
		Endereco end = cliente.getEndereco();
		StringBuilder sb = new StringBuilder();
		Contrato contrato = cliente.getContrato();
		
				
		sb.append(String.format("%011d", Long.valueOf(cliente.getCpf().replaceAll("\\D",""))));
		sb.append(String.format("%010d", Long.valueOf(cliente.getRg().replaceAll("\\D",""))));
		String nome = cliente.getNome().toUpperCase(Locale.ROOT);
			if (nome.length() >=30)
				sb.append(nome.substring(0, 30));
			else 
				sb.append(String.format("%-30s", nome));
		sb.append(String.format("%11d", Long.valueOf(cliente.getNumTel().replaceAll("\\D",""))));
		String logradouro = end.getLogradouro().toUpperCase();
			if (logradouro.length() >=20)
				sb.append(logradouro.substring(0, 20));
			else 
				sb.append(String.format("%-20s", logradouro));
		sb.append(String.format("%06d", Long.valueOf(end.getNumero())));
		String complemento = end.getComplemento().toUpperCase();
			if (complemento.length() >=10)
				sb.append(complemento.substring(0, 10));
			else 
				sb.append(String.format("%-10s", complemento));
		String bairro = end.getBairro().toUpperCase();
			if (bairro.length() >=15)
				sb.append(bairro.substring(0, 15));
			else 
				sb.append(String.format("%-15s", bairro));
		String cidade = end.getCidade().toUpperCase();
			if (cidade.length() >=30)
				sb.append(cidade.substring(0, 30));
			else 
				sb.append(String.format("%-30s", cidade));
		String estado = end.getEstado().toUpperCase();
			if (estado.length() >=2)
				sb.append(estado.substring(0, 2));
			else 
				sb.append(String.format("%-2s", estado));
		sb.append(String.format("%08d", Long.valueOf(end.getCep().replaceAll("\\D",""))));
		sb.append(end.getPais().getSigla());
		sb.append(String.format("%010d", contrato.getNumeroProtocolo()));
		sb.append(String.format("%8s", String.valueOf(contrato.getData().toString().replace("-", ""))));
		sb.append(String.format("%4s", String.valueOf(contrato.getHora().toString().replace(":",""))));
		sb.append(contrato.getTipoServico().getSigla());
		sb.append(String.format("%08d", Long.valueOf(contrato.getServico().getValor().toString().replaceAll("\\D",""))));
		sb.append(contrato.getTipoNotificacao().getSigla());
		
		System.out.println(sb.toString());
		return "";
		
	}

}