package com.proyecto.demo.repositorios;

import java.io.Serializable;
import java.util.List;

import com.proyecto.demo.entidades.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("clienterepositorio")
public interface ClienteRepositorio extends JpaRepository<Cliente, Serializable> {

    public abstract Cliente findByusuarioId(int usuarioId);
    public abstract List<Cliente> findAll();
}