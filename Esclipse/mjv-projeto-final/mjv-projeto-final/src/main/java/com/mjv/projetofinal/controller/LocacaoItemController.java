package com.mjv.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mjv.projetofinal.model.LocacaoItem;
import com.mjv.projetofinal.repository.LocacaoItemRepository;
import com.mjv.projetofinal.service.LocacaoItemService;

@RestController
@RequestMapping("/locacao_item")
public class LocacaoItemController {

	@Autowired
	LocacaoItemRepository locacaoItemRepository;
	
	@Autowired
	private LocacaoItemService servico;

	@PostMapping
	public void gravar(@RequestBody LocacaoItem locacaoItem) {
		servico.gravar(locacaoItem);
		
	}
	@PutMapping
	public void alterar(@RequestBody LocacaoItem locacaoItem) {
		servico.gravar(locacaoItem);
	}
	
	@GetMapping
	public List<LocacaoItem> listar() {
		return locacaoItemRepository.findAll();
	}
	@GetMapping("/{id}")
	public LocacaoItem buscar(@PathVariable ("id") Integer id ) {
		return locacaoItemRepository.findById(id).orElse(null);
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable ("id") Integer id ) {
		locacaoItemRepository.deleteById(id);
	}
}
