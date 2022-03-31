package com.netv.DTO;

import com.netv.model.Ciudad;
import com.netv.model.Departamento;
import com.netv.model.Plan;
import com.netv.model.TipoIdentificacion;

public class ContratoCrcDTO {

    private Long numeroContrato;

    private String nombres;

    private String apellidos;

    private TipoIdentificacion tipoIdentificacion;

    private String identificacion;

    private String email;

    private String telefonoCelular;

    private String direccion;

    private String estrato;

    private Departamento departamento;

    private Ciudad ciudad;

    private Plan plan;


    public Long getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(Long numeroContrato) {
        this.numeroContrato = numeroContrato;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
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

    public ContratoCrcDTO() {
    }

    public ContratoCrcDTO(Long numeroContrato, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion, String identificacion, String email, String telefonoCelular, String direccion, String estrato, Departamento departamento, Ciudad ciudad, Plan plan) {
        this.numeroContrato = numeroContrato;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.email = email;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
        this.estrato = estrato;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.plan = plan;
    }
}
