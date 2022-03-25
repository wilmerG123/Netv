package com.netv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ContratoCRC")
public class ContratoCRC {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_tipo")
	private TipoIdentificacion idTipoIdentificacion;

	@Column(name = "identificacion")
	private String identificacion;

	@Column(name = "Nombres")
	private String nombres;

	@Column(name = "Apellidos")
	private String apellidos;

	@Column(name = "Telefono_Celular")
	private String telefono_celular;

	@Column(name = "Direccion")
	private String direccion;

	@Column(name = "Email")
	private String email;

	@ManyToOne
	@JoinColumn(name = "id_departamento")
	private Departamento departamento;

	@ManyToOne
	@JoinColumn(name = "id_plan")
	private Plan plan;

	@ManyToOne
	@JoinColumn(name = "id_ciudad")
	private Ciudad ciudad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoIdentificacion getIdTipoIdentificacion() {
		return idTipoIdentificacion;
	}

	public void setIdTipoIdentificacion(TipoIdentificacion idTipoIdentificacion) {
		this.idTipoIdentificacion = idTipoIdentificacion;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public ContratoCRC() {

	}

	public ContratoCRC(Long id, TipoIdentificacion idTipoIdentificacion, String identificacion, String nombres, String apellidos, String telefono_celular, String direccion, String email, Departamento departamento, Plan plan, Ciudad ciudad) {
		this.id = id;
		this.idTipoIdentificacion = idTipoIdentificacion;
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono_celular = telefono_celular;
		this.direccion = direccion;
		this.email = email;
		this.departamento = departamento;
		this.plan = plan;
		this.ciudad = ciudad;
	}
}
