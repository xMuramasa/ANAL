package com.Proyecto.Demo.Entidades;

import java.sql.Date;

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

    @Column(name = "titulo")
    String titulo;

    @Column(name = "descripcion")
    String descripcion;

    @Column(name = "fecha_hora")
    String fecha_hora;

    public Consulta(){

    }

    public Consulta(int consultaId, int usuarioId, String titulo, String descripcion, String fecha_hora){
        this.consultaId = consultaId;
        this.usuarioId = usuarioId;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha_hora = fecha_hora;
    }

    public void setConsultaid(int consultaId){
        this.consultaId = consultaId;
    }
    public int getConsultaid(){
        return this.consultaId;
    }
    public void setUsrid(int usuarioId){
        this.usuarioId = usuarioId;
    }
    public int getUsrid(){
        return this.usuarioId;
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
    public void setFechaHora(String fecha_hora){
        this.fecha_hora = fecha_hora;
    }
    public String getFechaHora(){
        return this.fecha_hora;
    }
}