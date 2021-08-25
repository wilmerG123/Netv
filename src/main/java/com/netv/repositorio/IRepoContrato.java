package com.netv.repositorio;

import com.netv.model.Contrato;
import com.netv.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepoContrato extends JpaRepository<Contrato,Long> {

    List<Contrato> findByUsuario(Usuario usuario);

}
