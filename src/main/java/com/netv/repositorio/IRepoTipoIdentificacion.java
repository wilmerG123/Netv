package com.netv.repositorio;

import com.netv.model.TipoIdentificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface IRepoTipoIdentificacion extends JpaRepository<TipoIdentificacion,Long> {


}
