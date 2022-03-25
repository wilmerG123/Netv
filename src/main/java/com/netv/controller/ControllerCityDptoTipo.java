package com.netv.controller;

import com.netv.model.Ciudad;
import com.netv.model.Departamento;
import com.netv.model.TipoIdentificacion;
import com.netv.repositorio.IRepoCiudad;
import com.netv.repositorio.IRepoDepartamento;
import com.netv.repositorio.IRepoTipoIdentificacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/netv")
public class ControllerCityDptoTipo {

    @Autowired
    IRepoCiudad repoCiudad;
    @Autowired
    IRepoDepartamento repoDepartamento;
    @Autowired
    IRepoTipoIdentificacion repoTipoIdentificacion;

    @GetMapping("/ciudad")
    public List<Ciudad> obtenerCiudades (){
        return repoCiudad.findAll();
    }
    @PostMapping("/ciudad")
    public Ciudad guardarCiudad (@RequestBody Ciudad ciudad) {

        return repoCiudad.save(ciudad);
    }
    @GetMapping("/departamento")
    public List<Departamento> obtenerDepartamentos (){
        return repoDepartamento.findAll();
    }
    @PostMapping("/departamento")
    public Departamento guardarDepartamento (@RequestBody Departamento departamento) {

        return repoDepartamento.save(departamento);
    }
    @GetMapping("/tipoIdentificacion")
    public List<TipoIdentificacion> obtenerTiposDeIdentificacion (){
        return repoTipoIdentificacion.findAll();
    }
    @PostMapping("/tipoIdentificacion")
    public TipoIdentificacion guardarTipoDeIdentificacion (@RequestBody TipoIdentificacion tipoIdentificacion) {

        return repoTipoIdentificacion.save(tipoIdentificacion);
    }

}