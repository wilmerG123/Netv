package com.netv.DAOs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.netv.model.Contrato;
import com.netv.model.Planes;
import com.netv.model.Usuario;

@Service
@Transactional(readOnly = true)
public class ContratoDAO {

	@PersistenceContext
	private EntityManager em;

	public Contrato save(Contrato contrato, EntityManager em) {
		em = em == null ? this.em : em;
		em.getTransaction().begin();
		contrato = em.merge(contrato);
		em.getTransaction().commit();
		return contrato;
	}

	/**
	 * @param contratoFiltro
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Contrato> consultaGenerica(Contrato contratoFiltro) {
		String consulta = "select c from Contrato c join fetch c.id_plan ";
		consulta += agregarFiltros(contratoFiltro);
		List<Contrato> lstContratoEntity = em.createQuery(consulta).getResultList();
		return lstContratoEntity;
	}

	/**
	 * @param contratoFiltro
	 * @return
	 */
	private String agregarFiltros(Contrato contratoFiltro) {
		String filtros = " where 1=1 ";
		if (contratoFiltro == null) {
			return filtros;
		}
		filtros += contratoFiltro.getNumeroContrato() != null ? "and c.numeroContrato=" + contratoFiltro.getNumeroContrato() : "";

		if (contratoFiltro.getId_plan() != null) {
			Planes plan = contratoFiltro.getId_plan();
			filtros += plan.getId_plan() != null ? "and c.id_plan.id_plan=" + plan.getId_plan() : "";
			filtros += plan.getNombre() != null ? "and c.id_plan.nombre=" + plan.getNombre() : "";
		}

		if (contratoFiltro.getUsuario() != null) {
			Usuario usuario = contratoFiltro.getUsuario();
			filtros += usuario.getId() != null ? "and c.usuario.id=" + usuario.getId() : "";
		}

		return filtros;
	}
}
