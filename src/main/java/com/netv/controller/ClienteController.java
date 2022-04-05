package com.netv.controller;

import java.util.List;
import com.netv.DTO.ClienteDTO;
import com.netv.model.Cliente;
import com.netv.services.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/netv")
@CrossOrigin("*")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/cliente")
    public ResponseEntity<?> guardarCliente(@RequestBody ClienteDTO clienteDTO) {

        Cliente cliente = clienteServiceImpl.crearCliente(clienteDTO);

        return new ResponseEntity<Cliente>(cliente, HttpStatus.CREATED);
    }

    @PutMapping("/cliente/{id}")
    public ResponseEntity<?> actualizarCliente(@PathVariable(name = "id") Long id, @RequestBody ClienteDTO clienteDTO) {

        Cliente cliente = clienteServiceImpl.actualizarCliente(clienteDTO, id);

        return new ResponseEntity<Cliente>(cliente, HttpStatus.ACCEPTED);
    }

    @GetMapping("/cliente")
    public ResponseEntity<List<Cliente>> obtenerClientes() {

        List<Cliente> clientes = clienteServiceImpl.obtenerCliente();

        return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
    }

    @DeleteMapping("/cliente/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void borrarCliente(@PathVariable(name = "id") Long id) {

        clienteServiceImpl.borrarCliente(id);

    }
}

