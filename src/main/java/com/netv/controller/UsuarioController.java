package com.netv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netv.DAOs.ContratoDAO;
import com.netv.model.Usuario;
import com.netv.repositorio.IRepoContrato;
import com.netv.repositorio.IRepoUsuarios;

@RestController
@RequestMapping("/netv")
public class UsuarioController {

	@Autowired
	IRepoUsuarios iRepoUsuarios;

	@Autowired
	IRepoContrato repoContrato;

	@Autowired()
	ContratoDAO contratoDAO;

	@GetMapping("/usuario")
	public List<Usuario> ObtenerUsuarios() {
		List<Usuario> usuarioTemporal = iRepoUsuarios.findAll();
		return usuarioTemporal;
	}

	@PostMapping("/usuario")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		return iRepoUsuarios.save(usuario);
	}
}
