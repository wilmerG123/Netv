package com.netv.services;

import com.netv.DTO.ClienteDTO;
import com.netv.model.Cliente;
import com.netv.model.ContratoCRC;
import com.netv.repositorio.IRepoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class ClienteServiceImpl implements  IClienteService{

    @Autowired
    IRepoCliente irepocliente;

    @Override
    public Cliente crearCliente(ClienteDTO clienteDTO) {

        Cliente cliente = new Cliente();

        cliente.setNombres(clienteDTO.getNombres());
        cliente.setApellidos(clienteDTO.getApellidos());
        cliente.setTipoIdentificacion(clienteDTO.getTipoIdentificacion());
        cliente.setIdentificacion(clienteDTO.getIdentificacion());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setCiudad(clienteDTO.getCiudad());
        cliente.setDepartamento(clienteDTO.getDepartamento());
        cliente.setDireccion(clienteDTO.getDireccion());
        cliente.setTelefonoCelular(clienteDTO.getTelefonoCelular());
        cliente.setEstrato(clienteDTO.getEstrato());

        return irepocliente.save(cliente);
    }

    @Override
    public Cliente actualizarCliente(ClienteDTO clienteDTO, Long id) {
        Cliente cliente = new Cliente();

        cliente.setIdCliente(id);
        cliente.setNombres(clienteDTO.getNombres());
        cliente.setApellidos(clienteDTO.getApellidos());
        cliente.setTipoIdentificacion(clienteDTO.getTipoIdentificacion());
        cliente.setIdentificacion(clienteDTO.getIdentificacion());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setCiudad(clienteDTO.getCiudad());
        cliente.setDepartamento(clienteDTO.getDepartamento());
        cliente.setDireccion(clienteDTO.getDireccion());
        cliente.setTelefonoCelular(clienteDTO.getTelefonoCelular());
        cliente.setEstrato(clienteDTO.getEstrato());

        return irepocliente.save(cliente);
    }

    @Override
    public List<Cliente> obtenerCliente() {
        return irepocliente.findAll();
    }

    @Override
    public void borrarCliente(Long id) {

        irepocliente.deleteById(id);
    }
}
