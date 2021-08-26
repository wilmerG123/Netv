package com.netv.controller;

import java.util.List;

import com.netv.model.Contrato;
import com.netv.repositorio.IRepoContrato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netv.model.Usuario;
import com.netv.repositorio.IRepoUsuarios;

@RestController
@RequestMapping("/netv")
public class UsuarioController {

	@Autowired
	IRepoUsuarios iRepoUsuarios;

	@Autowired
	IRepoContrato repoContrato;

	@GetMapping("/usuario")
	public List<Usuario> ObtenerUsuarios() {
		List<Usuario> usuarioTemporal = iRepoUsuarios.findAll();
		if (usuarioTemporal == null || usuarioTemporal.isEmpty()) {
			return null;
		}
		for (Usuario usuario : usuarioTemporal) {
			List<Contrato> contratos = repoContrato.findByUsuario(usuario.getId());
			usuario.setContratos(contratos);
		}
		return usuarioTemporal;
	}

	@PostMapping("/usuario")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		return iRepoUsuarios.save(usuario);
	}
}
