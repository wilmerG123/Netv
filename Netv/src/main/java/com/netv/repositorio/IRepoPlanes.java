package com.netv.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netv.model.Planes;

public interface IRepoPlanes extends JpaRepository<Planes, Long>{

}
