package com.mjv.agualuzatracao.util;

import com.mjv.agualuzatracao.model.Cliente;
import com.mjv.agualuzatracao.model.Contrato;
import com.mjv.agualuzatracao.model.Endereco;

public class FormatarTxt {
	public String FormatarTxt (Contrato contrato){
		StringBuilder txt = new StringBuilder();
		Cliente cliente = contrato.getCliente();
		Endereco endereco = contrato.getCliente().getEndereco();
		TextoUtil padronizar = new TextoUtil();
				
		txt.append(padronizar.completarZero(cliente.getCpf().replaceAll("\\D",""), 11));
		txt.append(padronizar.completarZero(cliente.getRg().replaceAll("\\D",""), 10));
		txt.append(padronizar.ajustarTamanho(cliente.getNome(), 30));
		txt.append(padronizar.completarZero(cliente.getTel().replaceAll("\\D",""), 11));
		txt.append(padronizar.ajustarTamanho(endereco.getLogradouro(), 20));
		txt.append(padronizar.completarZero(endereco.getNumEndereco(), 6));
		txt.append(padronizar.ajustarTamanho(endereco.getComplemento(), 10));
		txt.append(padronizar.ajustarTamanho(endereco.getBairro(), 15));
		txt.append(padronizar.ajustarTamanho(endereco.getCidade(), 30));
		txt.append(padronizar.ajustarTamanho(endereco.getUf(), 2));
		txt.append(padronizar.completarZero(endereco.getCep().replaceAll("\\D",""), 8));
		txt.append(endereco.getPais().getSigla());
		txt.append(padronizar.completarZero(contrato.getProtocolo(), 10));
		txt.append(contrato.getData().toString().replaceAll("\\D",""));
		txt.append(contrato.getHora().toString().replaceAll("\\D",""));
		txt.append(contrato.getTipoServico().getSigla());
		txt.append(String.valueOf(contrato.getValor()).replaceAll("\\D",""));
		txt.append(contrato.getTipoNotificacao().getSigla());
		
		return txt.toString().toUpperCase();
	}
}
