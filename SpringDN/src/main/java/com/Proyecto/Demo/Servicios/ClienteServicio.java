package com.Proyecto.Demo.Servicios;

import java.util.List;

import com.Proyecto.Demo.Entidades.Cliente;
import com.Proyecto.Demo.Repositorios.ClienteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("clienteservicio")
public class ClienteServicio{
    @Autowired
    @Qualifier("clienterepositorio")
    private ClienteRepositorio repositorio;

    public boolean crear(Cliente cliente){
        try{
            repositorio.save(cliente);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(Cliente cliente){
        try{
            repositorio.save(cliente);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(int usuarioId){
        try{
            Cliente cliente = repositorio.findByusuarioId(usuarioId);
            repositorio.delete(cliente);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Cliente obtenerporId(int usuarioId){
        return repositorio.findByusuarioId(usuarioId);
    }

	public List<Cliente> obtenerTodos() {
		return repositorio.findAll();
	}
}
