package com.mjv.projetofinal.service;

import com.mjv.projetofinal.model.Locacao;
import com.mjv.projetofinal.model.LocacaoItem;
import com.mjv.projetofinal.repository.LocacaoRepository;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class LocacaoService {
	@Autowired
	private LocacaoRepository rep;
	
	public void gravar(Locacao locacao) {
		Double total = 0.0;
		LocalDate data=LocalDate.now();
		for(LocacaoItem item: locacao.getItens()) {
			total = total + item.getSubtotal();
		}
		locacao.setData(data);
		locacao.setValorFinal(total);
				
		rep.save(locacao);
	}
}
