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
	@Column(name = "id_contrato")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	@Column(name = "numero_contrato")
	private Long numeroContrato;

	@ManyToOne
	@JoinColumn(name = "id_plan")
	private Plan plan;

	@Column(name = "fecha_contrato")
	private Date fechaContrato;

	@Column(name = "fecha_inicio_contrato")
	private Date fechaInicioContrato;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Long getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Long numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public Date getFechaInicioContrato() {
		return fechaInicioContrato;
	}

	public void setFechaInicioContrato(Date fechaInicioContrato) {
		this.fechaInicioContrato = fechaInicioContrato;
	}

	public ContratoCRC(Long id, Cliente cliente, Long numeroContrato, Plan plan, Date fechaContrato, Date fechaInicioContrato) {
		this.id = id;
		this.cliente = cliente;
		this.numeroContrato = numeroContrato;
		this.plan = plan;
		this.fechaContrato = fechaContrato;
		this.fechaInicioContrato = fechaInicioContrato;
	}

	public ContratoCRC() {
	}
}


