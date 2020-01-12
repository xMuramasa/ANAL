package com.Proyecto.Demo.Controladores;

import java.util.List;

import javax.validation.Valid;

import com.Proyecto.Demo.Entidades.Pago;
import com.Proyecto.Demo.Servicios.PagoServicio;

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
@RequestMapping("/pago")
public class PagoControlador{

    
    @Autowired
    @Qualifier("pagoservicio")
    PagoServicio servicio;
    
    @GetMapping("/pago")
    public Pago obtenerPago(@RequestParam(name="pagoId", required=true) int pagoId){
        return servicio.obtenerporId(pagoId);
    }

    @PostMapping("/pago")
    public boolean agregarPago(@RequestBody @Valid Pago pago){
        return servicio.crear(pago);
    }

    @PutMapping("/pago")
    public boolean actualizarPago(@RequestBody @Valid Pago pago){
        return servicio.actualizar(pago);
    }

    @DeleteMapping("/pago/{id}")
    public boolean borrarPago(@PathVariable("pagoId") int pagoId){
        return servicio.borrar(pagoId);
    }
    
    @GetMapping("/getAll")
    public List<Pago> obtenerTodos() {
        return servicio.obtenerTodos();
    }
}