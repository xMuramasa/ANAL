package com.proyecto.demo.servicios;

import com.proyecto.demo.entidades.Mensaje;
import com.proyecto.demo.repositorios.MensajeRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("mensajeservicio")
public class MensajeServicio{
    @Autowired
    @Qualifier("mensajerepositorio")
    private MensajeRepositorio repositorio;

    public boolean crear(Mensaje mensaje){
        try{
            repositorio.save(mensaje);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(Mensaje mensaje){
        try{
            repositorio.save(mensaje);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(int mensajeId){
        try{
            Mensaje mensaje = repositorio.findBymensajeId(mensajeId);
            repositorio.delete(mensaje);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Mensaje obtenerporId(int mensajeId){
        return repositorio.findBymensajeId(mensajeId);
    }

    public List<Mensaje> obtenerTodos() {
        return repositorio.findAll();
    }
    public List<Mensaje> obtenerTodosPorconsultaId(int consultaId) {
        return repositorio.findAllByconsultaId(consultaId);
    }
}