package main.java.com.Proyecto.Demo.Servicios;

import com.Proyecto.Demo.Entidades.Consulta;
import com.Proyecto.Demo.Repositorios.ConsultaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

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
}