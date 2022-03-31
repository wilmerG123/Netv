package com.netv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;


@Entity
@Table(name = "ContratoCRC")
public class ContratoCRC {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long id;

	@Column(name = "numero_contrato")
	private Long numeroContrato;

	@ManyToOne
	@JoinColumn(name = "id_tipo")
	private TipoIdentificacion tipoIdentificacion;

	@Column(name = "identificacion")
	private String identificacion;

	@Column(name = "Nombres")
	private String nombres;

	@Column(name = "Apellidos")
	private String apellidos;

	@Column(name = "Telefono_Celular")
	private String telefonoCelular;

	@Column(name = "Direccion")
	private String direccion;

	@Column(name = "Email")
	private String email;

	@Column(name = "Estrato")
	private String Estrato;

	@ManyToOne
	@JoinColumn(name = "id_departamento")
	private Departamento departamento;

	@ManyToOne
	@JoinColumn(name = "id_plan")
	private Plan plan;

	@ManyToOne
	@JoinColumn(name = "id_ciudad")
	private Ciudad ciudad;

	@Column(name = "fecha_contrato")
	private Date fechaContrato;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
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

	public String getTelefonoCelular() {
		return telefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
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

	public String getEstrato() {
		return Estrato;
	}

	public void setEstrato(String estrato) {
		Estrato = estrato;
	}

	public Long getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Long numeroContrato) {
		this.numeroContrato = numeroContrato;
	}


	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public ContratoCRC() {
	}

	public ContratoCRC(Long id, Long numeroContrato, TipoIdentificacion tipoIdentificacion, String identificacion, String nombres, String apellidos, String telefonoCelular, String direccion, String email, String estrato, Departamento departamento, Plan plan, Ciudad ciudad, Date fechaContrato) {
		this.id = id;
		this.numeroContrato = numeroContrato;
		this.tipoIdentificacion = tipoIdentificacion;
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefonoCelular = telefonoCelular;
		this.direccion = direccion;
		this.email = email;
		Estrato = estrato;
		this.departamento = departamento;
		this.plan = plan;
		this.ciudad = ciudad;
		this.fechaContrato = fechaContrato;
	}
}
