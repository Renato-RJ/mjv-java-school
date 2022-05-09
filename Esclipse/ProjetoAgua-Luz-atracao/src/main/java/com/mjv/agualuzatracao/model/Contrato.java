package com.mjv.agualuzatracao.model;

import java.time.LocalDate;
import java.time.LocalTime;
import com.mjv.agualuzatracao.enuns.TipoNotificacao;
import com.mjv.agualuzatracao.enuns.TipoServico;

public class Contrato {
	
	private Cliente cliente;
	private TipoServico tipoServico;
	private Double valor;
    private TipoNotificacao tipoNotificacao;
    private LocalDate data = LocalDate.of(1, 1, 1);
    private LocalTime hora = LocalTime.of(1, 1);
    private String protocolo;
    
    public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public TipoServico getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}
	public TipoNotificacao getTipoNotificacao() {
		return tipoNotificacao;
	}
	public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
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
	public String getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	
}
