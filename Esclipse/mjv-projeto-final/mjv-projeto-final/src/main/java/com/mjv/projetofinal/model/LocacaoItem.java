package com.mjv.projetofinal.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="locacao_item")
public class LocacaoItem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Double subtotal;
	@Column(name="quantidade_dias")
	private Integer quantidadeDias;
	@Column(name="equipamento_id")
	private Integer equipamentoId;
	@ManyToOne
	@JoinColumn(name="locacao_id")
	private Locacao locacao;
	
}
