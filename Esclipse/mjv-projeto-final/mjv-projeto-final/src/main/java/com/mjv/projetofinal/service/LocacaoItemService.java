package com.mjv.projetofinal.service;

import com.mjv.projetofinal.model.Equipamento;
import com.mjv.projetofinal.model.LocacaoItem;
import com.mjv.projetofinal.repository.LocacaoItemRepository;

import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class LocacaoItemService {
	@Autowired
	private LocacaoItemRepository rep;
	
	public void gravar(LocacaoItem locacaoItem) {
		Long quantidadeDias = 0L;
		Double valorDiaria = 0.0;
		Double subtotal = 0.0;
		
		quantidadeDias = (long) Math.toIntExact(ChronoUnit.DAYS.between(locacaoItem.getDataRetirada(), locacaoItem.getDataDevolucao()));
		valorDiaria = locacaoItem.getValorDiaria();
		subtotal = quantidadeDias * valorDiaria;
		
		//locacaoItem.setValorDiaria(valorDiaria);
		locacaoItem.setQuantidadeDias(quantidadeDias);
		locacaoItem.setSubtotal(subtotal);
		rep.save(locacaoItem);
	}
}
