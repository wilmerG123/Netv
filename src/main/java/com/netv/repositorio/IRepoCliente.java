package com.netv.repositorio;

import com.netv.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepoCliente extends JpaRepository<Cliente,Long> {
}
