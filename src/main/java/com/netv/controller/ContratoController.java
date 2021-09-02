package com.netv.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netv.DAOs.ContratoDAO;
import com.netv.model.Ciudad;
import com.netv.model.Contrato;
import com.netv.model.Usuario;
import com.netv.repositorio.IRepoContrato;

@RestController
@RequestMapping("/netv")
public class ContratoController {

	@Autowired
	IRepoContrato repo;

	@Autowired
	ContratoDAO contratoDAO;

	@GetMapping("/contrato")
	public List<Contrato> obtenerContratos() {
		return contratoDAO.consultaGenerica(null);
//		return repo.findByUsuario(1L);

	}

	@PostMapping("/contrato/consultaGenerica")
	public List<Contrato> obtenerContratos(@RequestBody Contrato contrato) {
		List<String> lstClass = new ArrayList<>() ;
		lstClass.add(Ciudad.class.getSimpleName());

		return contratoDAO.consultaGenerica(contrato, lstClass);
//		return repo.findByUsuario(1L);

	}

	@PostMapping("/contrato")
	public Contrato guardarContrato(@RequestBody Contrato contrato) {
		return repo.save(contrato);
	}

}
