package com.netv.services;

import com.netv.DTO.ClienteDTO;
import com.netv.DTO.ContratoCrcDTO;
import com.netv.model.Cliente;
import com.netv.model.ContratoCRC;

import java.util.List;

public interface IClienteService {



    /**
     * Interface donde se definen las operaciones de negocio a implementar
     *
     * @author wilmer garnica
     *
     */

    public Cliente crearCliente (ClienteDTO clienteDTO);

    public Cliente actualizarCliente (ClienteDTO clienteDTO, Long id);

    public List<Cliente> obtenerCliente ();

    public void borrarCliente (Long id);



}
