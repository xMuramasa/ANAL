package com.Proyecto.Demo.Controladores;
import javax.validation.Valid;

import java.util.List;

import com.Proyecto.Demo.Entidades.Tecnico;
import com.Proyecto.Demo.Servicios.TecnicoServicio;

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
@RequestMapping("/tecnico")
public class TecnicoControlador{
    @Autowired
    @Qualifier("tecnicoservicio")
    TecnicoServicio servicio;

    @GetMapping("/tecnico")
    public Tecnico obtenerTecnico(@RequestParam(name="usuarioId", required=true) int usuarioId){
        return servicio.obtenerporId(usuarioId);
    }

    @PostMapping("/tecnico")
    public boolean agregarTecnico(@RequestBody @Valid Tecnico tecnico){
        return servicio.crear(tecnico);
    }

    @PutMapping("/tecnico")
    public boolean actualizarTecnico(@RequestBody @Valid Tecnico tecnico){
        return servicio.actualizar(tecnico);
    }

    @DeleteMapping("/tecnico/{id}")
    public boolean borrarTecnico(@PathVariable("usuarioId") int usuarioId){
        return servicio.borrar(usuarioId);
    }
        
    @GetMapping("/getAll")
    public List<Tecnico> obtenerTodos() {
        return servicio.obtenerTodos();
    }
}