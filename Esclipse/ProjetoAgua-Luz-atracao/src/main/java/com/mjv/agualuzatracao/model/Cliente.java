package com.mjv.agualuzatracao.model;

import java.time.LocalDate;
import java.time.LocalTime;

import com.mjv.agualuzatracao.enuns.Paises;
import com.mjv.agualuzatracao.enuns.TipoNotificacao;
import com.mjv.agualuzatracao.enuns.TipoServico;

public class Cliente {
	private String nome, cpf,rg,tel;
	private Endereco endereco;
    
   
//	StringBuilder dadoTxt = new StringBuilder();
//  StringBuilder dadoCsv = new StringBuilder();
	
    public String getNome() {
		return nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}    
}
