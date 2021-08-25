package com.netv.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netv.model.Ciudad;

@Repository
public interface IRepoCiudad extends JpaRepository<Ciudad, Long>{

}
