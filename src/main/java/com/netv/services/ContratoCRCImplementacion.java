package com.netv.services;

import com.netv.DTO.ContratoCrcDTO;
import com.netv.model.ContratoCRC;
import com.netv.repositorio.IRepoContratoCRC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ContratoCRCImplementacion implements  IContratoCRC{

//Clase que nos declara de manera formal, la logica del negocio respecto a la contratacion de NETV

    @Autowired
    private IRepoContratoCRC repoContrato;

    @Override
    public ContratoCRC crearContratoCRC(ContratoCrcDTO contratocrcdto) {

        ContratoCRC contrato = new ContratoCRC();
        contrato.setNumeroContrato(contratocrcdto.getNumeroContrato());
        contrato.setNombres(contratocrcdto.getNombres());
        contrato.setApellidos(contratocrcdto.getApellidos());
        contrato.setTipoIdentificacion(contratocrcdto.getTipoIdentificacion());
        contrato.setIdentificacion(contratocrcdto.getIdentificacion());
        contrato.setEmail(contratocrcdto.getEmail());
        contrato.setCiudad(contratocrcdto.getCiudad());
        contrato.setDepartamento(contratocrcdto.getDepartamento());
        contrato.setPlan(contratocrcdto.getPlan());
        contrato.setDireccion(contratocrcdto.getDireccion());
        contrato.setTelefonoCelular(contratocrcdto.getTelefonoCelular());
        contrato.setEstrato(contratocrcdto.getEstrato());
        contrato.setFechaContrato(new Timestamp(new Date().getTime()));
        return repoContrato.save(contrato);
    }

    @Override
    public ContratoCRC actualizarContratoCRC(ContratoCrcDTO contratocrcdto, Long id) {


        ContratoCRC contrato = new ContratoCRC();
        contrato.setId(id);
        contrato.setNumeroContrato(contratocrcdto.getNumeroContrato());
        contrato.setNombres(contratocrcdto.getNombres());
        contrato.setApellidos(contratocrcdto.getApellidos());
        contrato.setTipoIdentificacion(contratocrcdto.getTipoIdentificacion());
        contrato.setIdentificacion(contratocrcdto.getIdentificacion());
        contrato.setEmail(contratocrcdto.getEmail());
        contrato.setCiudad(contratocrcdto.getCiudad());
        contrato.setDepartamento(contratocrcdto.getDepartamento());
        contrato.setPlan(contratocrcdto.getPlan());
        contrato.setDireccion(contratocrcdto.getDireccion());
        contrato.setTelefonoCelular(contratocrcdto.getTelefonoCelular());
        contrato.setEstrato(contratocrcdto.getEstrato());
        contrato.setFechaContrato((new Date()));

        return repoContrato.save(contrato);
    }

    @Override
    public List<ContratoCRC> obtenerContratoCRC() {
        return repoContrato.findAll();
    }

    @Override
    public void borrarContratoCRC(Long id) {

        repoContrato.deleteById(id);
    }
}
