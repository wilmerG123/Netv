package com.netv.model;


import javax.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long idCliente;

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
    @JoinColumn(name = "id_ciudad")
    private Ciudad ciudad;

    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamento departamento;


    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
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

    public String getEstrato() {
        return Estrato;
    }

    public void setEstrato(String estrato) {
        Estrato = estrato;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Cliente(Long idCliente, TipoIdentificacion tipoIdentificacion, String identificacion, String nombres, String apellidos, String telefonoCelular, String direccion, String email, String estrato, Ciudad ciudad, Departamento departamento) {
        this.idCliente = idCliente;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
        this.email = email;
        Estrato = estrato;
        this.ciudad = ciudad;
        this.departamento = departamento;
    }

    public Cliente() {
    }
}
