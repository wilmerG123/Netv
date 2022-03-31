package com.netv.controller;

import java.util.List;

import com.netv.DTO.PlanDTO;
import com.netv.services.ContratoCRCImplementacion;
import com.netv.services.PlanesImplementacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.netv.model.Plan;
import com.netv.repositorio.IRepoPlanes;

@RestController
@RequestMapping("/netv")
@CrossOrigin("*")
public class PlanesController {

	@Autowired
	IRepoPlanes repo;
	@Autowired
	PlanesImplementacion planesImplemenetacion;


	@PostMapping("/plan")
	public ResponseEntity<?> guardarPlan(@RequestBody PlanDTO plandto) {

		Plan plan = planesImplemenetacion.crearPlan(plandto);

		return new ResponseEntity<Plan>(plan, HttpStatus.CREATED);
	}

	@PutMapping("/plan/{id}")
	public ResponseEntity<?> actualizarPlan(@PathVariable(name = "id") Long id, @RequestBody PlanDTO plandto) {

		Plan plan = planesImplemenetacion.actualizarPlan(plandto, id);

		return new ResponseEntity<Plan>(plan, HttpStatus.ACCEPTED);
	}

	@GetMapping("/plan")
	public ResponseEntity<List<Plan>> obtenerPlan() {

		List<Plan> planes = planesImplemenetacion.obtenerPlan();

		return new ResponseEntity<List<Plan>>(planes, HttpStatus.OK);
	}

	@DeleteMapping("/plan/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void borrarPlan(@PathVariable(name = "id") Long id) {

		planesImplemenetacion.borrarPlan(id);

	}
}
