package com.mjv.projetofinal.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="locacao")
public class Locacao {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	@Column (name="data_retirada")
	private LocalDate dataRetirada;
	@Column(name="data_devolucao")
	private LocalDate dataDevolucao;
	@Column (name="valor_final", columnDefinition="decimal(7,2)")
	private double valorFinal;
	@OneToMany
	@JoinColumn(name="locacao_item_id")
	private List <LocacaoItem> intens;
}
