package com.mjv.agualuzatracao.model;

import java.time.LocalDate;
import java.time.LocalTime;

import com.mjv.agualuzatracao.enums.Servico;
import com.mjv.agualuzatracao.enums.TipoNotificacao;
import com.mjv.agualuzatracao.enums.TipoServico;

public class Contrato {
	private Long numeroProtocolo;
	
	private Servico servico;
	
	private LocalDate data;
	
	private LocalTime hora;
	
	private Cadastro cliente;
	
	private TipoNotificacao tipoNotificacao;
	
	private TipoServico tipoServico;

	public Long getNumeroProtocolo() {
		return numeroProtocolo;
	}

	public void setNumeroProtocolo(Long numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public Cadastro getCliente() {
		return cliente;
	}

	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}

	public TipoNotificacao getTipoNotificacao() {
		return tipoNotificacao;
	}

	public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	@Override
	public String toString() {
		return "Contrato [numeroProtocolo=" + numeroProtocolo + ", servico=" + servico + ", data=" + data + ", hora="
				+ hora + ", cliente=" + cliente + ", tipoNotificacao=" + tipoNotificacao + ", tipoServico="
				+ tipoServico + "]";
	}

	
}