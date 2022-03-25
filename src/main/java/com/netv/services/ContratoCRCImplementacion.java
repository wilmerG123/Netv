package com.netv.services;

import com.netv.DTO.ContratoCrcDTO;
import com.netv.model.ContratoCRC;
import com.netv.repositorio.IRepoContratoCRC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratoCRCImplementacion implements  IContratoCRC{

    @Autowired
    private IRepoContratoCRC repoContrato;

    @Override
    public ContratoCRC crearContratoCRC(ContratoCrcDTO contratocrcdto) {

        ContratoCRC contrato = new ContratoCRC();
        contrato.setNombres(contratocrcdto.getNombre());
        contrato.setApellidos(contratocrcdto.getApellidos());
        contrato.setIdTipoIdentificacion(contratocrcdto.getIdTipoIdentificacion());
        contrato.setIdentificacion(contratocrcdto.getIdentificacion());
        contrato.setEmail(contratocrcdto.getEmail());
        contrato.setCiudad(contratocrcdto.getCiudad());
        contrato.setDepartamento(contratocrcdto.getDepartamento());
        contrato.setPlan(contratocrcdto.getPlan());
        contrato.setDireccion(contratocrcdto.getDireccion());
        contrato.setTelefono_celular(contrato.getTelefono_celular());
        return repoContrato.save(contrato);
    }

    @Override
    public ContratoCRC actualizarContratoCRC(ContratoCrcDTO contratocrcdto, Long id) {


        ContratoCRC contrato = new ContratoCRC();
        contrato.setId(id);
        contrato.setNombres(contratocrcdto.getNombre());
        contrato.setApellidos(contratocrcdto.getApellidos());
        contrato.setIdTipoIdentificacion(contratocrcdto.getIdTipoIdentificacion());
        contrato.setIdentificacion(contratocrcdto.getIdentificacion());
        contrato.setEmail(contratocrcdto.getEmail());
        contrato.setCiudad(contratocrcdto.getCiudad());
        contrato.setDepartamento(contratocrcdto.getDepartamento());
        contrato.setPlan(contratocrcdto.getPlan());
        contrato.setDireccion(contratocrcdto.getDireccion());
        contrato.setTelefono_celular(contrato.getTelefono_celular());
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
