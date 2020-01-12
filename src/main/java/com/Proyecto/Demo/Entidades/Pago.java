package com.Proyecto.Demo.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "Pago")
public class Pago {

    @Id
    @GenericGenerator(name = "incrementpago", strategy = "increment")
    @GeneratedValue(generator = "incrementpago")
    @Column(name = "pagoId")
    private int pagoId;

    @Column(name = "monto")
    @Type(type = "text")
    private String monto;

    @Column(name = "consultaId")
    private int consultaId;

    @Column(name = "clienteId")
    private int clienteId;

    @Column(name = "tecnicoId")
    private int tecnicoId;

    @Column(name = "fecha")
    @Type(type = "text")
    private String fecha;

    public Pago(){

    }

    public Pago(int pagoId, String monto, int consultaId, int tecnicoId, int clienteId, String fecha) {
        this.pagoId = pagoId;
        this.monto = monto;
        this.consultaId = consultaId;
        this.clienteId = clienteId;
        this.tecnicoId = tecnicoId;
        this.fecha = fecha;
    }


    public void setUsuarioId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getUsuarioId() {
        return this.clienteId;
    }

    // this is a comment
    public void setTecnicoId(int tecnicoId) {
        this.tecnicoId = tecnicoId;
    }

    public int getTecnicoId() {
        return this.tecnicoId;
    }

    public void seMonto(String monto) {
        this.monto = monto;
    }

    public String getMonto() {
        return this.monto;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return this.fecha;
    }

}