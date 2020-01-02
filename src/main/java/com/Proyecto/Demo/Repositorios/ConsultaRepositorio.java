package com.Proyecto.Demo.Repositorios;

import java.io.Serializable;
import com.Proyecto.Demo.Entidades.Consulta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("consultarepositorio")
public interface ConsultaRepositorio extends JpaRepository<Consulta, Serializable> {

    public abstract Consulta findByconsultaId(int consultaId);
    
    public abstract List<Consulta> findAll();

    public abstract List<Consulta> findAllByusuarioId(int usuarioId);

}