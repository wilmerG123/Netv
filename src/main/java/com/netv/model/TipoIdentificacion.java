package com.netv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_identificacion")
public class TipoIdentificacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, name = "id_tipo")
	private Long IdTipoIdentificacion;
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Abreviatura")
	private String abreviatura;

	public Long getId() {
		return IdTipoIdentificacion;
	}

	public void setId(Long id) {
		this.IdTipoIdentificacion = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public TipoIdentificacion() {
		super();
	}

	public TipoIdentificacion(Long id, String nombre, String abreviatura) {
		super();
		this.IdTipoIdentificacion = id;
		this.nombre = nombre;
		this.abreviatura = abreviatura;
	}

}
