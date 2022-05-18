package com.mjv.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mjv.projetofinal.model.Locacao;
import com.mjv.projetofinal.repository.LocacaoRepository;
import com.mjv.projetofinal.service.LocacaoService;

@RestController
@RequestMapping("/locacao")
public class LocacaoController {
	
	@Autowired
	LocacaoRepository locacaoRepository;
		
	@Autowired
	private LocacaoService rep;
	
	@PostMapping
	public void gravar(@RequestBody Locacao locacao) {
		rep.gravar(locacao);
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