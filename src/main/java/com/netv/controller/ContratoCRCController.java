package com.netv.controller;

import java.util.List;

import com.netv.DTO.ContratoCrcDTO;

import com.netv.services.ContratoCRCImplementacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.netv.model.ContratoCRC;
import com.netv.repositorio.IRepoContratoCRC;

@RestController
@RequestMapping("/netv")
@CrossOrigin("*")
public class ContratoCRCController {

	@Autowired
	private ContratoCRCImplementacion contratoCRCImplementacion;

	@PostMapping("/contrato")
	public ResponseEntity<?> guardarContratoCRC(@RequestBody ContratoCrcDTO contratodto) {

		ContratoCRC contrato = contratoCRCImplementacion.crearContratoCRC(contratodto);

		return new ResponseEntity<ContratoCRC>(contrato, HttpStatus.CREATED);
	}

	@PutMapping("/contrato/{id}")
	public ResponseEntity<?> actualizarContrato(@PathVariable(name = "id") Long id, @RequestBody ContratoCrcDTO contratodto) {

		ContratoCRC contrato = contratoCRCImplementacion.actualizarContratoCRC(contratodto, id);

		return new ResponseEntity<ContratoCRC>(contrato, HttpStatus.ACCEPTED);
	}

	@GetMapping("/contrato")
	public ResponseEntity<List<ContratoCRC>> obtenerPlan() {

		List<ContratoCRC> contratos = contratoCRCImplementacion.obtenerContratoCRC();

		return new ResponseEntity<List<ContratoCRC>>(contratos, HttpStatus.OK);
	}

	@DeleteMapping("/contrato/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void borrarContrato(@PathVariable(name = "id") Long id) {

		contratoCRCImplementacion.borrarContratoCRC(id);

	}
}
