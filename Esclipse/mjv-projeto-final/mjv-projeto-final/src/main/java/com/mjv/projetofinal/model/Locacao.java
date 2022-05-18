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
	private Integer id;
	@JsonIgnore
	private LocalDate data;
	@JoinColumn(name="cliente_id")
	private Integer clienteId;
	@Column (name="valor_final", columnDefinition="decimal(7,2)")
	private double valorFinal;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="locacao_id")
	private List <LocacaoItem> equipamento;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public List<LocacaoItem> getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(List<LocacaoItem> equipamento) {
		this.equipamento = equipamento;
	}
	
}
