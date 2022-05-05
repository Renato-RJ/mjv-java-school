//package com.mjv.agualuzatracao;
//
//import com.mjv.agualuzatracao.model.Cadastro;
//
//public class FormatarCsv {
//	public String FormatarCsv (Cadastro cliente){
//		StringBuilder txt = new StringBuilder();
//				
//		txt.append(String.format("%011d", Long.valueOf(cliente.getCpf().replaceAll("\\D","")))+";");
//		txt.append(String.format("%010d", Long.valueOf(cliente.getRg().replaceAll("\\D","")))+";");
//		String nome = cliente.getNome();
//			if (nome.length() >=30)
//				txt.append(nome.substring(0, 30).toUpperCase()+";");
//			else 
//				txt.append(String.format("%-30s", nome.toUpperCase())+";");
//		txt.append(String.format("%011d", Long.valueOf(cliente.getTel().replaceAll("\\D","")))+";");
//		String logradouro = cliente.getLogradouro();
//			if (logradouro.length() >=20)
//				txt.append(logradouro.substring(0, 20).toUpperCase()+";");
//			else 
//				txt.append(String.format("%-20s", logradouro.toUpperCase())+";");
//		txt.append(String.format("%06d", Long.valueOf(cliente.getNumEnd()))+";");
//		String complemento = cliente.getComplemento();
//			if (complemento.length() >=10)
//				txt.append(complemento.substring(0, 10).toUpperCase()+";");
//			else 
//				txt.append(String.format("%-10s", logradouro.toUpperCase())+";");
//		String bairro = cliente.getBairro();
//			if (bairro.length() >=15)
//				txt.append(bairro.substring(0, 15).toUpperCase()+";");
//			else 
//				txt.append(String.format("%-15s", bairro.toUpperCase())+";");
//		String cidade = cliente.getCidade();
//			if (cidade.length() >=30)
//				txt.append(cidade.substring(0, 30).toUpperCase()+";");
//			else 
//				txt.append(String.format("%-30s", cidade.toUpperCase())+";");
//		String uf = cliente.getUf();
//			if (uf.length() >=2)
//				txt.append(uf.substring(0, 2).toUpperCase()+";");
//			else 
//				txt.append(String.format("%-2s", uf.toUpperCase())+";");
//		txt.append(String.format("%08d", Long.valueOf(cliente.getCep().replaceAll("\\D","")))+";");
//		txt.append(cliente.getPais().getSigla()+";");
//		txt.append(String.format("%010d", Long.valueOf(cliente.getProtocolo()))+";");
//		txt.append(cliente.getData().toString().replaceAll("\\D","")+";");
//		txt.append(cliente.getHora().toString().replaceAll("\\D","")+";");
//		txt.append(cliente.getTipoServico().getSigla()+";");
//		txt.append(String.valueOf(cliente.getValor()).replaceAll("\\D","")+";");
//		txt.append(cliente.getTipoNotificacao().getSigla());
//		
//		return txt.toString();
//	}
//
//
//}
