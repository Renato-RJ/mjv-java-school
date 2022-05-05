package com.mjv.agualuzatracao.model;

import com.mjv.agualuzatracao.enums.Paises;

public class Cadastro {
	private String nome;
	private String numTel;
	private String cpf;
	private String rg;
	private Endereco endereco;
	private Contrato contrato;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	@Override
	public String toString() {
		return "Cadastro [nome=" + nome + ", numTel=" + numTel + ", cpf=" + cpf + ", rg=" + rg + ", endereco="
				+ endereco + ", contrato=" + contrato + "]";
	}
}