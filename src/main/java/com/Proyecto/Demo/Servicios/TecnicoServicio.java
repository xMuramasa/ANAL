package com.proyecto.demo.servicios;

import java.util.List;

import com.proyecto.demo.entidades.Tecnico;
import com.proyecto.demo.repositorios.TecnicoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("tecnicoservicio")
public class TecnicoServicio {
    @Autowired
    @Qualifier("tecnicorepositorio")
    private TecnicoRepositorio repositorio;

    public boolean crear(Tecnico tecnico) {
        try {
            repositorio.save(tecnico);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean actualizar(Tecnico tecnico) {
        try {
            repositorio.save(tecnico);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean borrar(int tecnicoId) {
        try {
            Tecnico tecnico = repositorio.findBytecnicoId(tecnicoId);
            repositorio.delete(tecnico);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Tecnico obtenerporId(int tecnicoId) {
        return repositorio.findBytecnicoId(tecnicoId);
    }

    public List<Tecnico> obtenerTodos() {
        return repositorio.findAll();
    }
}
