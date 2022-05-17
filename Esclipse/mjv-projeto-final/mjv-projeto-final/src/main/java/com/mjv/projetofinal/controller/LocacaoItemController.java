package com.mjv.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mjv.projetofinal.model.LocacaoItem;
import com.mjv.projetofinal.repository.LocacaoItemRepository;

@RestController
@RequestMapping("/locacao_item")
public class LocacaoItemController {

	@Autowired
	LocacaoItemRepository locacaoItemRepository;

	@PostMapping
	public void gravar(@RequestBody LocacaoItem locacaoItem) {
		//System.out.println(locacaoItem.getEquipamento());
		locacaoItemRepository.save(locacaoItem);
	}

	@GetMapping
	public List<LocacaoItem> listar() {
		return locacaoItemRepository.findAll();
	}

	@DeleteMapping("{id}")
	public void deletar(@PathVariable Integer id, @RequestBody LocacaoItem locacaoItem) {
		locacaoItemRepository.delete(locacaoItem);
	}
}
