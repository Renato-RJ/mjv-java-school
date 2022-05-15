//package com.mjv.projetofinal.model;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="locacao")
//public class Locacao {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Integer id;
//	@ManyToOne
//	@JoinColumn(name="cliente_id")
//	private Cliente cliente;
//	@Column (name="valor_final", columnDefinition="decimal(7,2)")
//	private double valorFinal;
//	@OneToMany
//	@JoinColumn(name="locacao_item_id")
//	private List <LocacaoItem> intens;
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public Cliente getCliente() {
//		return cliente;
//	}
//	public void setCliente(Cliente cliente) {
//		this.cliente = cliente;
//	}
//	public LocalDate getDataRetirada() {
//		return dataRetirada;
//	}
//	public void setDataRetirada(LocalDate dataRetirada) {
//		this.dataRetirada = dataRetirada;
//	}
//	public LocalDate getDataDevolucao() {
//		return dataDevolucao;
//	}
//	public void setDataDevolucao(LocalDate dataDevolucao) {
//		this.dataDevolucao = dataDevolucao;
//	}
//	public double getValorFinal() {
//		return valorFinal;
//	}
//	public void setValorFinal(double valorFinal) {
//		this.valorFinal = valorFinal;
//	}
//	public List<LocacaoItem> getIntens() {
//		return intens;
//	}
//	public void setIntens(List<LocacaoItem> intens) {
//		this.intens = intens;
//	}
//	
//}
