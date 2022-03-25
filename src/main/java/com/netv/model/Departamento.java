package com.netv.model;

import javax.persistence.*;

@Entity
@Table(name="departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_departamento")
    private Long idDepartamento;

    private String nombre;

    private String codiogoDane;

    public Long getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodiogoDane() {
        return codiogoDane;
    }

    public void setCodiogoDane(String codiogoDane) {
        this.codiogoDane = codiogoDane;
    }

    public Departamento() {
    }

    public Departamento(Long idDepartamento, String nombre, String codiogoDane) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.codiogoDane = codiogoDane;
    }
}
