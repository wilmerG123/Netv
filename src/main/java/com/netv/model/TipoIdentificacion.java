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
	private Long idTipoIdentificacion;
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Abreviatura")
	private String abreviatura;

	public Long getIdTipoIdentificacion() {
		return idTipoIdentificacion;
	}

	public void setIdTipoIdentificacion(Long idTipoIdentificacion) {
		this.idTipoIdentificacion = idTipoIdentificacion;
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
	}

	public TipoIdentificacion(Long idTipoIdentificacion, String nombre, String abreviatura) {
		this.idTipoIdentificacion = idTipoIdentificacion;
		this.nombre = nombre;
		this.abreviatura = abreviatura;
	}
}
