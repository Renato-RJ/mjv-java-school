package com.mjv.projetofinal.model;

import javax.persistence.*;

@Entity
@Table(name="cliente")

public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome, cpf, tel;
	@OneToOne(cascade=CascadeType.ALL)
	private Endereco endereco;
	
}
