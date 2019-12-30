package com.Proyecto.Demo.Servicios;

import com.Proyecto.Demo.Entidades.Tecnico;
import com.Proyecto.Demo.Repositorios.TecnicoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("tecnicoservicio")
public class TecnicoServicio{
    @Autowired
    @Qualifier("tecnicorepositorio")
    private TecnicoRepositorio repositorio;

    public boolean crear(Tecnico tecnico){
        try{
            repositorio.save(tecnico);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(Tecnico tecnico){
        try{
            repositorio.save(tecnico);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(int usuarioId){
        try{
            Tecnico tecnico = repositorio.findByusuarioId(usuarioId);
            repositorio.delete(tecnico);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Tecnico obtenerporId(int usuarioId){
        return repositorio.findByusuarioId(usuarioId);
    }
}
