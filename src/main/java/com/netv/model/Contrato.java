package com.netv.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Contrato")
public class Contrato {

    @Id
    @Column(nullable = false, name = "numeroContrato")
    private Long numeroContrato;

    @ManyToOne
    @JoinColumn(name = "id_plan")
    private Planes id_plan;

    @Column(name = "FechafirmadoContrato")
    private Date fechaFirmado;

    @Column(name = "fechaRenovacionPlan")
    private Date fechaRenovacionPlan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;


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
