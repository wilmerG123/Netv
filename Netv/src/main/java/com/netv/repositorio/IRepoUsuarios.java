package com.netv.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netv.model.Usuario;

@Repository
public interface IRepoUsuarios extends JpaRepository <Usuario,Long> {

}
