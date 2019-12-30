package com.Proyecto.Demo.Servicios;

import com.Proyecto.Demo.Entidades.Consulta;
import com.Proyecto.Demo.Repositorios.ConsultaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("consultaservicio")
public class ConsultaServicio{
    @Autowired
    @Qualifier("consultarepositorio")
    private ConsultaRepositorio repositorio;

    public boolean crear(Consulta cliente){
        try{
            repositorio.save(cliente);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(Consulta consulta){
        try{
            repositorio.save(consulta);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(int consultaId){
        try{
            Consulta consulta = repositorio.findByconsultaId(consultaId);
            repositorio.delete(consulta);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Consulta obtenerporId(int consultaId){
        return repositorio.findByconsultaId(consultaId);
    }
}