package com.netv.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.netv.model.Contrato;

@Repository
@Transactional(readOnly = true)
public interface IRepoContrato extends JpaRepository<Contrato, Long> {

	@Query(value = "select c from Contrato c join fetch c.id_plan")
	public List<Contrato> findByUsuario(@Param("idUsuario") Long idUsuario);
}
