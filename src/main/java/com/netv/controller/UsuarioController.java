package com.netv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netv.model.Usuario;
import com.netv.repositorio.IRepositorio;

@RestController
@RequestMapping("/netv")
public class UsuarioController {


    @Autowired
    IRepositorio repo;

    @GetMapping("/usuario")
    public List<Usuario>ObtenerUsuarios(){
       return repo.findAll();
    }
    @PostMapping("/usuario")
    public Usuario guardarUsuario (@RequestBody Usuario usuario) {
      return repo.save(usuario);
    }
}
	