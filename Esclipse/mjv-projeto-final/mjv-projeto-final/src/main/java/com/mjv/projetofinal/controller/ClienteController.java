package com.mjv.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mjv.projetofinal.model.Cliente;
import com.mjv.projetofinal.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	private ClienteRepository clienteRepository;
	
	@PostMapping
	public void gravar(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
	}
	@PutMapping
	public void alterar(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
	}
	
	@GetMapping
	public List<Cliente> listar(){
		return clienteRepository.findAll();
		}
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable ("id") Integer id) {
		clienteRepository.deleteById(id);
	}
}
