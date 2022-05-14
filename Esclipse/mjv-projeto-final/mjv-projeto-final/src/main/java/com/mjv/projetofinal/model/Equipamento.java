package com.mjv.projetofinal.model;

import javax.persistence.*;

import com.mjv.projetofinal.enuns.TipoBike;

import lombok.*;

@Setter
@Getter
@Entity
@Table(name="equipamento")

public class Equipamento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private TipoBike tipoBike;
	private String marca, modelo, grupoCambio, tamQuadro, suspensão;
	@Column(name="qtd_disponivel")
	private Integer qtdDisponivel;
	@Column(name="valor_unitario")
	private Double valorUnitario;

}
