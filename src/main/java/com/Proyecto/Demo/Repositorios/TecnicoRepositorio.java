package com.proyecto.demo.repositorios;

import java.io.Serializable;
import java.util.List;

import com.proyecto.demo.entidades.Tecnico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tecnicorepositorio")
public interface TecnicoRepositorio extends JpaRepository<Tecnico, Serializable> {

    public abstract Tecnico findBytecnicoId(int tecnicoId);
    public abstract List<Tecnico> findAll();
}