package com.mjv.projetofinal.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

import javax.persistence.*;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mjv.projetofinal.repository.EquipamentoRepository;
 
@Entity
@Table(name = "locacao_item")
public class LocacaoItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "subtotal")
	private Double subtotal;
	@Column(name = "data_retirada")
	private LocalDate dataRetirada;
	@Column(name = "data_devolucao")
	private LocalDate dataDevolucao;
	@Column(name = "quantidade_dias")
	private Long quantidadeDias;
	@Column(name="equipamento_id")
	private Integer equipamentoId;
	@Column(name = "valor_diaria")
	private Double valorDiaria;
	@Column(name="locacao_id")
	private Integer locacaoId;
	public Integer getLocacaoId() {
		return locacaoId;
	}
	public void setLocacaoId(Integer locacaoId) {
		this.locacaoId = locacaoId;
	}
	
	public Integer getEquipamentoId() {
		return equipamentoId;
	}

	public void setEquipamentoId(Integer equipamentoId) {
		this.equipamentoId = equipamentoId;
	}

	public Double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(LocalDate dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Long getQuantidadeDias() {
		return quantidadeDias;
	}

	public void setQuantidadeDias(Long quantidadeDias) {
		this.quantidadeDias = quantidadeDias;
		;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocacaoItem other = (LocacaoItem) obj;
		return Objects.equals(id, other.id);
	}

}
