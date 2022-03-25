package com.netv.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.netv.model.Plan;

@Repository
@Transactional(readOnly = true)
public interface IRepoPlanes extends JpaRepository<Plan, Long>{

}
