package com.mjv.projetofinal.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="locacao")
public class Locacao {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonIgnore
	private Integer id;
	@JsonIgnore
	private LocalDate data;
	@Column(name="cliente_id")
	private Integer clienteId;
	@Column (name="valor_final", columnDefinition="decimal(7,2)")
	private double valorFinal;
	@OneToMany
	@JoinColumn(name="locacao_item_id")
	private List <LocacaoItem> itens;
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Integer getClienteId() {
		return clienteId;
	}
	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}
	public double getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
	public List<LocacaoItem> getItens() {
		return itens;
	}
	public void setItens(List<LocacaoItem> itens) {
		this.itens = itens;
	}
}
