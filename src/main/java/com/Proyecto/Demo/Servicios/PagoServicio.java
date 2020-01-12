package com.Proyecto.Demo.Servicios;

import java.util.List;

import com.Proyecto.Demo.Entidades.Pago;
import com.Proyecto.Demo.Repositorios.PagoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("pagoservicio")
public class PagoServicio{
    @Autowired
    @Qualifier("pagorepositorio")
    private PagoRepositorio repositorio;

    public boolean crear(Pago pago){
        try{
            repositorio.save(pago);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean actualizar(Pago pago){
        try{
            repositorio.save(pago);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean borrar(int pagoId){
        try{
            Pago pago = repositorio.findBypagoId(pagoId);
            repositorio.delete(pago);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Pago obtenerporId(int pagoId){
        return repositorio.findBypagoId(pagoId);
    }

	public List<Pago> obtenerTodos() {
		return repositorio.findAll();
	}
}
