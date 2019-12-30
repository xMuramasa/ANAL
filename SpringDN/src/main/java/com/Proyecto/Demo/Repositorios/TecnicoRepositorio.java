package com.Proyecto.Demo.Repositorios;

import java.io.Serializable;
import com.Proyecto.Demo.Entidades.Tecnico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tecnicorepositorio")
public interface TecnicoRepositorio extends JpaRepository<Tecnico, Serializable> {

    public abstract Tecnico findByusuarioId(int usuarioId);

}