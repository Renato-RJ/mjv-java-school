package com.mjv.openbanking;

import java.time.LocalDate;
import java.math.BigDecimal;

public class Movimentacao {
	private LocalDate dataMovimentacao;
	private String cpfCnpj;
	private String nomeCliente;
	private Double valor;
	private TipoMovimentacao tipo;
	private Boolean movimentacaoEstornada;
	
	public LocalDate getDataMovimentacao() {
		return dataMovimentacao;
	}
	public void setDataMovimentacao(LocalDate dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public TipoMovimentacao getTipo() {
		return tipo;
	}
	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}
	public Boolean getMovimentacaoEstornada() {
		return movimentacaoEstornada;
	}
	public void setMovimentacaoEstornada(Boolean movimentacaoEstornada) {
		this.movimentacaoEstornada = movimentacaoEstornada;
	}
	
	
}
