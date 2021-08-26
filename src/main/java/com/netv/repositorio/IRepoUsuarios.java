package com.netv.repositorio;

import com.netv.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRepoUsuarios extends JpaRepository <Usuario,Long> {

}
