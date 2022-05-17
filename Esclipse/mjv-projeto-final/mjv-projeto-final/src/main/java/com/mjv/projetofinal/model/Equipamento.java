package com.mjv.projetofinal.model;

import java.util.Objects;

import javax.persistence.*;

import com.mjv.projetofinal.enuns.TipoBike;


@Entity
@Table(name="equipamento")

public class Equipamento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.STRING)
	@Column(name="tipo_equipamento")
	private TipoBike tipoBike;
	private String marca, modelo;
	@Column(name="grupo_cambio")
	private String grupoCambio;
	@Column(name="tamanho_quadro")
	private String tamQuadro;
	private String suspensao;
	@Column(name="qtd_disponivel")
	private Integer qtdDisponivel;
	@Column(name="valor_unitario")
	private Double valorUnitario;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getGrupoCambio() {
		return grupoCambio;
	}
	public void setGrupoCambio(String grupoCambio) {
		this.grupoCambio = grupoCambio;
	}
	public String getTamQuadro() {
		return tamQuadro;
	}
	public void setTamQuadro(String tamQuadro) {
		this.tamQuadro = tamQuadro;
	}
	public String getSuspensao() {
		return suspensao;
	}
	public void setSuspensao(String suspensao) {
		this.suspensao = suspensao;
	}
	public Integer getQtdDisponivel() {
		return qtdDisponivel;
	}
	public void setQtdDisponivel(Integer qtdDisponivel) {
		this.qtdDisponivel = qtdDisponivel;
	}
	public Double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public TipoBike getTipoBike() {
		return tipoBike;
	}
	public void setTipoBike(TipoBike tipoBike) {
		this.tipoBike = tipoBike;
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
		Equipamento other = (Equipamento) obj;
		return Objects.equals(id, other.id);
	}
	
}
