package com.mjv.projetofinal.service;

import com.mjv.projetofinal.model.Equipamento;
import com.mjv.projetofinal.model.LocacaoItem;
import com.mjv.projetofinal.repository.EquipamentoRepository;
import com.mjv.projetofinal.repository.LocacaoItemRepository;

import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class LocacaoItemService {
	@Autowired
	private LocacaoItemRepository rep;
	
	@Autowired
	private EquipamentoRepository equip;
	
	public void gravar(LocacaoItem locacaoItem) {
		Long quantidadeDias = 0L;
		
		quantidadeDias = (long) Math.toIntExact(ChronoUnit.DAYS.between(locacaoItem.getDataRetirada(), locacaoItem.getDataDevolucao()));
		Equipamento equipamento = equip.getById(locacaoItem.getEquipamentoId());
		locacaoItem.setValorDiaria(equipamento.getValorUnitario());
		locacaoItem.setSubtotal(quantidadeDias *locacaoItem.getValorDiaria());
		locacaoItem.setQuantidadeDias(quantidadeDias);
		rep.save(locacaoItem);
	}
}
