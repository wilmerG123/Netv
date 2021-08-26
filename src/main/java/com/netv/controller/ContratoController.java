package com.netv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netv.model.Contrato;
import com.netv.repositorio.IRepoContrato;

@RestController
@RequestMapping("/netv")
public class ContratoController {

	@Autowired
	IRepoContrato repo;

//	@GetMapping("/contrato")
//	public List<Contrato> obtenerContratos() {
//		return repo.findAll();
//
//	}

	@PostMapping("/contrato")
	public Contrato guardarContrato(@RequestBody Contrato contrato) {
		return repo.save(contrato);
	}

}
