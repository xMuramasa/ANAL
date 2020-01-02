package com.Proyecto.Demo.Controladores;
import javax.validation.Valid;

import java.util.List;

import com.Proyecto.Demo.Entidades.Consulta;
import com.Proyecto.Demo.Servicios.ConsultaServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consulta")
public class ConsultaControlador{
    @Autowired
    @Qualifier("consultaservicio")
    ConsultaServicio servicio;

    @GetMapping("/consulta")
    public Consulta obtenerConsulta(@RequestParam(name="consultaId", required=true) int consultaId){
        return servicio.obtenerporId(consultaId);
    }

    @PostMapping("/consulta")
    public boolean agregarConsulta(@RequestBody @Valid Consulta consulta){
        System.out.println(consulta.getDescripcion()+ " " +consulta.getUsuarioId()+ " " +
            consulta.getFecha()+ " " +consulta.getDescripcion()+ " " +consulta.getConsultaId()+" "+
            consulta.getTitulo());
        return servicio.crear(consulta);
    }

    @PutMapping("/consulta")
    public boolean actualizarConsulta(@RequestBody @Valid Consulta consulta){
        return servicio.actualizar(consulta);
    }

    @DeleteMapping("/consulta/{id}")
    public boolean borrarConsulta(@PathVariable("consultaId") int consultaId){
        return servicio.borrar(consultaId);
    }

    @GetMapping("/getAll")
    public List<Consulta> obtenerTodos() {
        return servicio.obtenerTodos();
    }

    @GetMapping("/getAllbyUserId/{id}")
    public List<Consulta> obtenerTodosPorusuarioId(@PathVariable("usuarioId") int usuarioId) {
        return servicio.obtenerTodosPorusuarioId(usuarioId);
    }
}