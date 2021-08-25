package com.netv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netv.model.Planes;
import com.netv.repositorio.IRepoPlanes;

@RestController
@RequestMapping("/netv")
public class PlanesController {

	@Autowired
	IRepoPlanes repo;

	@GetMapping("/planes")
	public List<Planes> ObtenerPlanes() {
		return repo.findAll();
	}

	@PostMapping("/planes")
	public Planes guardarPlan(@RequestBody Planes planes) {
		return repo.save(planes);
	}
}
