package com.Proyecto.Demo.Repositorios;

import java.io.Serializable;
import com.Proyecto.Demo.Entidades.Mensaje;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("mensajerepositorio")
public interface MensajeRepositorio extends JpaRepository<Mensaje, Serializable> {

    public abstract Mensaje findBymensajeId(int mensajeId);
    public abstract List<Mensaje> findAll();
    public abstract List<Mensaje> findAllByconsultaId(int consultaId);

}