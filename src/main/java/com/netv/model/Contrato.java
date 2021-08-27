package com.netv.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.netv.DAOs.ContratoDAO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Contrato")
public class Contrato extends ContratoDAO {

	@Id
	@Column(nullable = false, name = "numeroContrato")
	private Long numeroContrato;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_plan")
	private Planes id_plan;

	@Column(name = "FechafirmadoContrato")
	private Date fechaFirmado;

	@Column(name = "fechaRenovacionPlan")
	private Date fechaRenovacionPlan;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Contrato() {
		this.usuario = new Usuario();
		this.id_plan = new Planes();
	}

	public Long getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Long numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Planes getId_plan() {
		return id_plan;
	}

	public void setId_plan(Planes id_plan) {
		this.id_plan = id_plan;
	}

	public Date getFechaFirmado() {
		return fechaFirmado;
	}

	public void setFechaFirmado(Date fechaFirmado) {
		this.fechaFirmado = fechaFirmado;
	}

	public Date getFechaRenovacionPlan() {
		return fechaRenovacionPlan;
	}

	public void setFechaRenovacionPlan(Date fechaRenovacionPlan) {
		this.fechaRenovacionPlan = fechaRenovacionPlan;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
