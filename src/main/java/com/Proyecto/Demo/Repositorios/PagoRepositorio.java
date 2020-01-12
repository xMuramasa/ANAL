package com.Proyecto.Demo.Repositorios;

import java.io.Serializable;
import java.util.List;

import com.Proyecto.Demo.Entidades.Pago;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("pagorepositorio")
public interface PagoRepositorio extends JpaRepository<Pago, Serializable> {

    public abstract Pago findBypagoId(int pagoId);
    public abstract List<Pago> findAll();
}