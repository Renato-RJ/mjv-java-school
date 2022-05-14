package com.mjv.projetofinal.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="endereco")

public class Endereco {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String rua, numero, complemento, bairro, cidade, estado, cep;

}
