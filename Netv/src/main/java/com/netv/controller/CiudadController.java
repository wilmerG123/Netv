package com.netv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netv.model.Ciudad;
import com.netv.repositorio.IRepoCiudad;

@RestController
@RequestMapping("/netv")
public class CiudadController {
	
	@Autowired
	IRepoCiudad repo;
	
	@GetMapping("/ciudad")
	public List<Ciudad> obtenerCiudades (){
		return repo.findAll();
		
	}
	@PostMapping("/ciudad")
	public Ciudad guardarCiudad (@RequestBody Ciudad ciudad) {
		
		return repo.save(ciudad);
	}

}
