package br.gov.rn.natal.pgm.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Entity
@Table(name = "procurador")
@Data
public class Procurador implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(length = 150, nullable = false)
	private String nome;
	
	@Column(length = 50)
	private String procuradoria;
	
	@NotBlank
	@Column(length = 100, nullable = false)
	private String email;
	
	@Column(length = 15)
	private String celular;
	
	@CreationTimestamp
	@Column(name = "data_criacao")
	private Date dataCriacao;

	@UpdateTimestamp
	@Column(name = "data_atualizacao")
	private Date dataAtualizacao;
}
