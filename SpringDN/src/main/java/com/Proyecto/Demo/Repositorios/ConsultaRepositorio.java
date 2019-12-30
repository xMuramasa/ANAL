package com.Proyecto.Demo.Repositorios;

import java.io.Serializable;
import com.Proyecto.Demo.Entidades.Consulta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("consultarepositorio")
public interface ConsultaRepositorio extends JpaRepository<Consulta, Serializable> {

    public abstract Consulta findByconsultaId(int consultaId);

}