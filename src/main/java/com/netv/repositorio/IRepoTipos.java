package com.netv.repositorio;

import com.netv.model.TipoIdentificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoTipos extends JpaRepository<TipoIdentificacion,Long> {
}
