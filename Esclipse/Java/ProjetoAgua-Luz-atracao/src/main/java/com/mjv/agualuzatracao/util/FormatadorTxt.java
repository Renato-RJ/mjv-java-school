package com.mjv.agualuzatracao.util;

import com.mjv.agualuzatracao.model.Cadastro;

public class FormatadorTxt {
	
	public static String linhaTxt (Cadastro cliente) {
		StringBuilder textoTxt = new StringBuilder();
		
		textoTxt.append(FormatadorUtil.padronizarTamanho(cliente.getCpf(), 11).replaceAll("\\D",""));
		textoTxt.append(FormatadorUtil.padronizarTamanho(cliente.getRg(), 10));
		textoTxt.append(FormatadorUtil.padronizarTamanho(cliente.getNome(), 30));
		textoTxt.append(FormatadorUtil.padronizarTamanho(cliente.getNumTel().replaceAll("\\D",""), 11));
		textoTxt.append(FormatadorUtil.padronizarTamanho(cliente.getEndereco().getLogradouro(), 20));
		textoTxt.append(FormatadorUtil.padronizarTamanho(cliente.getEndereco().getNumero(), 6));
		textoTxt.append(FormatadorUtil.padronizarTamanho(cliente.getEndereco().getComplemento(), 10));
		textoTxt.append(FormatadorUtil.padronizarTamanho(cliente.getEndereco().getBairro(), 15));
		textoTxt.append(FormatadorUtil.padronizarTamanho(cliente.getEndereco().getCidade(), 30));
		textoTxt.append(FormatadorUtil.padronizarTamanho(cliente.getEndereco().getEstado(), 2));
		textoTxt.append(FormatadorUtil.padronizarTamanho(cliente.getEndereco().getCep(), 8));
		textoTxt.append(cliente.getEndereco().getPais().getSigla());
		textoTxt.append(FormatadorUtil.padronizarTamanho(cliente.getContrato().getNumeroProtocolo().toString(), 10));
		textoTxt.append(cliente.getContrato().getData().toString().replaceAll("\\D",""));
		textoTxt.append(cliente.getContrato().getHora().toString().replaceAll("\\D",""));
		textoTxt.append(cliente.getContrato().getTipoServico().getSigla());
		textoTxt.append(cliente.getContrato().getServico().getValor().toString().replaceAll("\\D",""));
		textoTxt.append(cliente.getContrato().getTipoNotificacao().getSigla());
		
		return textoTxt.toString().toUpperCase();
	}
}
