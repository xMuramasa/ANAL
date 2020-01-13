package com.proyecto.demo.controladores;

import javax.validation.Valid;

import java.util.List;


import com.proyecto.demo.entidades.Mensaje;
import com.proyecto.demo.servicios.MensajeServicio;

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
@RequestMapping("/mensaje")
public class MensajeControlador{
    @Autowired
    @Qualifier("mensajeservicio")
    MensajeServicio servicio;

    @GetMapping("/mensaje")
    public Mensaje obtenerMensaje(@RequestParam(name="mensajeId", required=true) int mensajeId){
        return servicio.obtenerporId(mensajeId);
    }

    @PostMapping("/mensaje")
    public boolean agregarMensaje(@RequestBody @Valid Mensaje mensaje){
        return servicio.crear(mensaje);
    }

    @PutMapping("/mensaje")
    public boolean actualizarMensaje(@RequestBody @Valid Mensaje mensaje){
        return servicio.actualizar(mensaje);
    }

    @DeleteMapping("/mensaje/{id}")
    public boolean borrarMensaje(@PathVariable("mensajeId") int mensajeId){
        return servicio.borrar(mensajeId);
    }
        
    @GetMapping("/getAll")
    public List<Mensaje> obtenerTodos() {
        return servicio.obtenerTodos();
    }

    @GetMapping("/getAllByQuery")
    public List<Mensaje> obtenerTodosPorconsultaId(@PathVariable("consultaId") int consultaId) {
        return servicio.obtenerTodosPorconsultaId(consultaId);
    }
}