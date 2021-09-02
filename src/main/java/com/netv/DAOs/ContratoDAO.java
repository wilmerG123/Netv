package com.netv.DAOs;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Fetch;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.netv.model.Ciudad;
import com.netv.model.Contrato;
import com.netv.model.TipoIdentificacion;
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
	public List<Contrato> consultaGenerica(Contrato contratoFiltro) {
		return consultaGenerica(contratoFiltro, null);
	}

	/**
	 * @param contratoFiltro
	 * @param lstFetch
	 * @return
	 */
	public List<Contrato> consultaGenerica(Contrato contratoFiltro, List<String> lstFetch) {
//		String consulta = "select c, c.id_plan, c.usuario.ciudad,c.usuario.tipo from Contrato c join fetch c.usuario     ";
//		consulta += agregarFiltros(contratoFiltro);
//		List<Contrato> lstContratoEntity = em.createQuery(consulta).getResultList();
//		return lstContratoEntity;

		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<Contrato> criteriaQuery = criteriaBuilder.createQuery(Contrato.class);
		Root<Contrato> root = criteriaQuery.from(Contrato.class);

		agregarFetcths(root, lstFetch);
		agregarFiltros(criteriaBuilder, criteriaQuery, root, contratoFiltro);

		TypedQuery<Contrato> query = em.createQuery(criteriaQuery);
		return query.getResultList();
	}

	/**
	 * @param root
	 * @param lstFetch
	 */
	private void agregarFetcths(Root<Contrato> root, List<String> lstFetch) {
		if (lstFetch == null || lstFetch.isEmpty()) {
			return;
		}
		if (lstFetch.contains(Usuario.class.getSimpleName()) || lstFetch.contains(Ciudad.class.getSimpleName()) || lstFetch.contains(TipoIdentificacion.class.getSimpleName())) {
			Fetch<Contrato, Usuario> fetchUsuario = root.fetch("usuario", JoinType.LEFT);

			if (lstFetch.contains(Ciudad.class.getSimpleName())) {
				fetchUsuario.fetch("ciudad", JoinType.LEFT); // fetch a contrato.usuario.ciudad
			}
			if (lstFetch.contains(TipoIdentificacion.class.getSimpleName())) {
				fetchUsuario.fetch("tipo", JoinType.LEFT); // fetch a contrato.usuario.tipo
			}
		}

	}

	/**
	 * @param criteriaBuilder
	 * @param criteriaQuery
	 * @param root
	 */
	private void agregarFiltros(CriteriaBuilder criteriaBuilder, CriteriaQuery<Contrato> criteriaQuery, Root<Contrato> root, Contrato contratoFiltro) {
		if (contratoFiltro == null) {
			return;
		}
		List<Predicate> lstPredicates = new ArrayList<Predicate>();
		if (contratoFiltro.getNumeroContrato() != null) {
			lstPredicates.add(criteriaBuilder.equal(root.get("numeroContrato"), "1"));
		}
		if (contratoFiltro.getUsuario() != null) {
			Usuario usuario = contratoFiltro.getUsuario();
			if (usuario.getId() != null) {
				lstPredicates.add(criteriaBuilder.equal(root.get("usuario").get("id"), usuario.getId()));
			}
		}
		criteriaQuery.where(lstPredicates.toArray(new Predicate[0]));
	}

}
