package com.mjv.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mjv.projetofinal.model.Cliente;
import com.mjv.projetofinal.model.Equipamento;
import com.mjv.projetofinal.repository.EquipamentoRepository;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {
	@Autowired
	private EquipamentoRepository equipamentoRepository;
	
	@PostMapping
	public void gravar(@RequestBody Equipamento equipamento) {
		equipamentoRepository.save(equipamento);
	}
	@GetMapping
	public List<Equipamento> listar(){
		return equipamentoRepository.findAll();
		}
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable ("id") Integer id) {
		equipamentoRepository.deleteById(id);
	}
	
}
