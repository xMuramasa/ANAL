package com.Proyecto.Demo.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "Tecnico")
@Entity


public class Tecnico {

    @Id
    @GenericGenerator(name = "incrementoId", strategy = "increment")
    @GeneratedValue(generator = "incrementoId")
    
    @Column(name = "tecnicoId")
    int tecnicoId;

    @Column(name = "nombre")
    String nombre;

    @Column(name = "pass") //sabemos que no se hace jsj
    String pass;

    public void setTecnicoId(int id){
        this.tecnicoId = id;
    }

    public int getTecnicoId(){
        return this.tecnicoId;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setPass(String pass){
        this.pass = pass;
    }
    
    public String getPass(){
        return this.pass;
    }
}
