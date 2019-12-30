package com.Proyecto.Demo.Repositorios;

import java.io.Serializable;
import java.util.List;

import com.Proyecto.Demo.Entidades.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("clienterepositorio")
public interface ClienteRepositorio extends JpaRepository<Cliente, Serializable> {

    public abstract Cliente findByusuarioId(int usuarioId);
    public abstract List<Cliente> findAll();
}