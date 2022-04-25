package com.mjv.agualuzatracao;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cadastro {
	String nome, cpf,rg,logradouro,complemento,bairro,cidade,uf,cep,tel;
	int numEnd, protocolo;
	double valor;
    TipoServico tipoServico;
    TipoNotificacao tipoNotificacao;
    Paises pais;
    LocalDate data = LocalDate.of(0001, 01, 01);
    LocalTime hora = LocalTime.of(01, 01);
    
    public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	StringBuilder dadoTxt = new StringBuilder();
    StringBuilder dadoCsv = new StringBuilder();
	
    
    public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getNome() {
		return nome;
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
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Integer getNumEnd() {
		return numEnd;
	}
	public void setNumEnd(Integer numEnd) {
		this.numEnd = numEnd;
	}
	public Integer getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(Integer protocolo) {
		this.protocolo = protocolo;
	}
	public TipoServico getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public TipoNotificacao getTipoNotificacao() {
		return tipoNotificacao;
	}
	public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}
	public Paises getPais() {
		return pais;
	}
	public void setPais(Paises pais) {
		this.pais = pais;
	}    
}
