package com.Proyecto.Demo.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "Consulta")
@Entity

public class Consulta{

    @Id
    
    @GenericGenerator(name = "incrementoconsulta", strategy = "increment")
    @GeneratedValue(generator = "incrementoconsulta")
    
    @Column(name = "consultaId")
    int consultaId;

    @Column(name = "usuarioId")
    int usuarioId;
    
    @Column(name = "tecnicoId")
    int tecnicoId;

    @Column(name = "titulo")
    String titulo;

    @Column(name = "descripcion")
    String descripcion;

    @Column(name = "fecha")
    String fecha;

    public Consulta(){

    }

    public Consulta(int consultaId, int usuarioId, int tecnicoId, String titulo, String descripcion, String fecha){
        this.consultaId = consultaId;
        this.usuarioId = usuarioId;
        this.tecnicoId = tecnicoId;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public void setConsultaId(int consultaId){
        this.consultaId = consultaId;
    }
    public int getConsultaId(){
        return this.consultaId;
    }
    public void setUsuarioId(int usuarioId){
        this.usuarioId = usuarioId;
    }
    public int getUsuarioId(){
        return this.usuarioId;
    }
    //this is a comment
    public void setTecnicoId(int tecnicoId){
        this.tecnicoId = tecnicoId;
    }
    public int getTecnicoId(){
        return this.tecnicoId;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public String getFecha(){
        return this.fecha;
    }
}