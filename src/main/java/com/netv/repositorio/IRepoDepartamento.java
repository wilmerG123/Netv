package com.netv.repositorio;

import com.netv.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepoDepartamento extends JpaRepository <Departamento,Long> {
}
