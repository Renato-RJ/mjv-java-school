package com.mjv.projetofinal.service;

import com.mjv.projetofinal.model.Equipamento;
import com.mjv.projetofinal.model.Locacao;
import com.mjv.projetofinal.model.LocacaoItem;
import com.mjv.projetofinal.repository.EquipamentoRepository;
import com.mjv.projetofinal.repository.LocacaoItemRepository;
import com.mjv.projetofinal.repository.LocacaoRepository;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LocacaoService {
	@Autowired
	private LocacaoRepository rep;
	@Autowired
	private EquipamentoRepository equip;
	@Autowired
	private LocacaoItemRepository repItem;
	
	public void gravar(Locacao locacao) {
		Double total = 0.0;
		for(LocacaoItem item: locacao.getEquipamento()) {
			LocalDate data=LocalDate.now();
			if (item.getId()!=0) {
			LocacaoItem locacaoItem = repItem.getById(item.getId());
			Integer locItem = locacaoItem.getLocacaoId();
				LocacaoItem dataLocacaoItem = repItem.getById(item.getId());
				item.setDataRetirada(dataLocacaoItem.getDataRetirada());
				item.setDataDevolucao(dataLocacaoItem.getDataDevolucao());
				item.setQuantidadeDias((long) Math
						.toIntExact(ChronoUnit.DAYS.between(item.getDataRetirada(), item.getDataDevolucao())));
				Equipamento equipamento = equip.getById(item.getEquipamentoId());
				item.setValorDiaria(equipamento.getValorUnitario());
				item.setSubtotal(item.getQuantidadeDias() * item.getValorDiaria());
				total = total + item.getSubtotal();
				locacao.setData(data);
			}
			else{
				item.setQuantidadeDias((long) Math.toIntExact(ChronoUnit.DAYS.between(item.getDataRetirada(), item.getDataDevolucao())));
				Equipamento equipamento = equip.getById(item.getEquipamentoId());
				item.setValorDiaria(equipamento.getValorUnitario());
				item.setSubtotal(item.getQuantidadeDias()*item.getValorDiaria());
				total = total + item.getSubtotal();
				locacao.setData(data);	
			}
			
		}
		
		locacao.setValorFinal(total);
		rep.save(locacao);
	}
}
