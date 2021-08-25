package com.netv.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	@Column(name = "Nombres")
	private String nombres;
	@Column(name = "Apellidos")
	private String apellidos;
	@Column(name = "Telefono_Celular")
	private String telefono_celular;
	@Column(name = "Ciudad")
	private String ciudad;
	@Column(name = "Direccion")
	private String direccion;
	@Column(name = "Correo")
	private String correo;
	@Column(name = "Contrato")
	private String contrato;
	@ManyToOne
	@JoinColumn(name="id_plan")
	private Planes plan;
	@Column(name="fecha_ingreso")
	private Date fechaIngreso;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono_celular() {
		return telefono_celular;
	}
	public void setTelefono_celular(String telefono_celular) {
		this.telefono_celular = telefono_celular;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public Planes getPlan() {
		return plan;
	}
	public void setPlan(Planes plan) {
		this.plan = plan;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public Usuario(Long id, String nombres, String apellidos, String telefono_celular, String ciudad, String direccion,
			String correo, String contrato, Planes plan, Date fechaIngreso) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono_celular = telefono_celular;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.correo = correo;
		this.contrato = contrato;
		this.plan = plan;
		this.fechaIngreso = fechaIngreso;
	}
	public Usuario() {
		super();
	}

	

}
