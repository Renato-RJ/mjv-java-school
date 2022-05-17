package com.mjv.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mjv.projetofinal.model.Locacao;
import com.mjv.projetofinal.repository.LocacaoRepository;

@RestController
@RequestMapping("/locacao")
public class LocacaoController {
	@Autowired
	private LocacaoRepository locacaoRepository;
	
	@PostMapping
	public void gravar(@RequestBody Locacao locacao) {
		locacaoRepository.save(locacao);
	}
	@GetMapping
	public List<Locacao> listar(){
		return locacaoRepository.findAll();
		}
	@DeleteMapping("{id}")
	public void deletar(@PathVariable Integer id, @RequestBody Locacao locacao) {
		locacaoRepository.delete(locacao);
	}
}