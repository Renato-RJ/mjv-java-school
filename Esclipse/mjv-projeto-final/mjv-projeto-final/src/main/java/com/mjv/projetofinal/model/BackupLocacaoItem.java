//package com.mjv.projetofinal.model;
//
//import java.time.LocalDate;
//import java.time.temporal.ChronoUnit;
//import java.util.Objects;
//
//import javax.persistence.*;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//@Table(name="locacao_item")
//public class LocacaoItem {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Integer id;
//	@Column(name="subtotal")
//	private Double subtotal;
//	@Column (name="valor_diaria")
//	private Double valorDiaria;
//	@Column (name="data_retirada")
//	private LocalDate dataRetirada;
//	@Column(name="data_devolucao")
//	private LocalDate dataDevolucao;
//	@Column(name="quantidade_dias")
//	private Long quantidadeDias;
//	//@Column(name="equipamento_id")
//	private Integer itemId;
//	//@Transient
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="equipamento_id", referencedColumnName = "id")
//	public Equipamento equipamento;
//	
//
//	
//	
//
//	@JsonIgnore
//	public Equipamento getEquipamento() {
//		return equipamento;
//	}
//	@JsonIgnore
//	public void setEquipamento(Equipamento equipamento) {
//		this.equipamento = equipamento;
//	}
//	public Integer getItemId() {
//		return itemId;
//	}
//	public void setItemId(Integer itemId) {
//		this.itemId = itemId;
//	}
//	
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public Double getSubtotal() {
//		return subtotal;
//	}
//	public void setSubtotal(Double subtotal) {
//		this.subtotal = subtotal;
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
//	public Long getQuantidadeDias() {
//		return quantidadeDias;
//	}
//	public void setQuantidadeDias(Long quantidadeDias) {
//		this.quantidadeDias = (long) Math.toIntExact(ChronoUnit.DAYS.between(getDataRetirada(), getDataDevolucao()));;
//	}
//	public Double getValorDiaria() {
//		return valorDiaria;
//	}
//	public void setValorDiaria(Double a) {
//		this.valorDiaria = equipamento.getValorUnitario();
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		LocacaoItem other = (LocacaoItem) obj;
//		return Objects.equals(id, other.id);
//	}
//	
//
//}