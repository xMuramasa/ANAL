package com.proyecto.demo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Table(name = "Cliente")
@Entity

public class Cliente {

    @Id
    @GenericGenerator(name = "incrementoId", strategy = "increment")
    @GeneratedValue(generator = "incrementoId")
    
    @Column(name = "usuarioId")
    int usuarioId;

    @Column(name = "nombre")
    String nombre;

    @Column(name = "pass") //sabemos que no se hace jsj
    String pass;

    public void setid(int id){
        this.usuarioId = id;
    }

    public int getid(){
        return this.usuarioId;
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
