package com.Proyecto.Demo.Controladores;

import java.util.List;

import javax.validation.Valid;

import com.Proyecto.Demo.Entidades.Cliente;
import com.Proyecto.Demo.Servicios.ClienteServicio;

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
@RequestMapping("/cliente")
public class ClienteControlador{

    
    @Autowired
    @Qualifier("clienteservicio")
    ClienteServicio servicio;
    
    @GetMapping("/cliente")
    public Cliente obtenerCliente(@RequestParam(name="usuarioId", required=true) int usuarioId){
        return servicio.obtenerporId(usuarioId);
    }

    @PostMapping("/cliente")
    public boolean agregarCliente(@RequestBody @Valid Cliente cliente){
        return servicio.crear(cliente);
    }

    @PutMapping("/cliente")
    public boolean actualizarCliente(@RequestBody @Valid Cliente cliente){
        return servicio.actualizar(cliente);
    }

    @DeleteMapping("/cliente/{id}")
    public boolean borrarCliente(@PathVariable("usuarioId") int usuarioId){
        return servicio.borrar(usuarioId);
    }
    
    @GetMapping("/getAll")
    public List<Cliente> obtenerTodos() {
        return servicio.obtenerTodos();
    }
}