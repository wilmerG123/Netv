package com.netv.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.netv.model.ContratoCRC;

@Repository
@Transactional(readOnly = true)
public interface IRepoContratoCRC extends JpaRepository<ContratoCRC, Long> {


}
