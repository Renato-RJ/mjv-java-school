package com.mjv.projetofinal.service;

import com.mjv.projetofinal.model.Locacao;
import com.mjv.projetofinal.model.LocacaoItem;
import com.mjv.projetofinal.repository.LocacaoRepository;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LocacaoService {
	@Autowired
	private LocacaoRepository rep;
//	@Autowired
//	private LocacaoItem itemLoc;
	
	public void gravar(Locacao locacao) {
		//Long qtdDias = (long) Math.toIntExact(ChronoUnit.DAYS.between(itemLoc.getDataRetirada(), itemLoc.getDataDevolucao()));
		Double total = 0.0;
		LocalDate data=LocalDate.now();
		for(LocacaoItem item: locacao.getEquipamento()) {
			total = total + item.getSubtotal();
		}
		locacao.setData(data);
		locacao.setValorFinal(total);
		//itemLoc.setQuantidadeDias(qtdDias);		
		rep.save(locacao);
	}
}
