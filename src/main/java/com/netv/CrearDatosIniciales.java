package com.netv;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.netv.model.Ciudad;
import com.netv.model.Contrato;
import com.netv.model.Planes;
import com.netv.model.TipoIdentificacion;
import com.netv.model.Usuario;
import com.netv.repositorio.IRepoCiudad;
import com.netv.repositorio.IRepoContrato;
import com.netv.repositorio.IRepoPlanes;
import com.netv.repositorio.IRepoTipos;
import com.netv.repositorio.IRepoUsuarios;

@Service
@Transactional
public class CrearDatosIniciales {

	@Autowired
	IRepoCiudad iRepoCiudad;

	@Autowired
	IRepoUsuarios iRepoUsuarios;

	@Autowired
	IRepoTipos iRepoTipos;

	@Autowired
	IRepoContrato iRepoContrato;

	@Autowired
	IRepoPlanes iRepoPlanes;

	@PostConstruct
	private void crearDatosIniciales() {

		Ciudad ciudad = new Ciudad(null, "Bogota");
		iRepoCiudad.save(ciudad);

		TipoIdentificacion tipoIdentificacion = new TipoIdentificacion(null, "Cedula de ciudadania", "CC");
		iRepoTipos.save(tipoIdentificacion);

		Usuario usuario = new Usuario();
		usuario.setApellidos("user 1");
		usuario.setCiudad(ciudad);
		usuario.setCorreo("correousuario1@gmail.com");
		usuario.setDireccion("calle 123");
		usuario.setIdentificacion("12345");
		usuario.setNombres("user 1");
		usuario.setTelefono_celular("123456");
		usuario.setTipo(tipoIdentificacion);
		iRepoUsuarios.save(usuario);
		
//		usuario=new Usuario

		Planes planes = new Planes(null, "Plan Premium", "Plan severa chimba");
		iRepoPlanes.save(planes);

		Contrato contrato = new Contrato();
		contrato.setFechaFirmado(new Date());
		contrato.setFechaRenovacionPlan(new Date());
		contrato.setId_plan(planes);
		contrato.setNumeroContrato(1234L);
		contrato.setUsuario(usuario);
		iRepoContrato.save(contrato);

	}

}
