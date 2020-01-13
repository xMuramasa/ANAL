package com.proyecto.demo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="Mensaje")
public class Mensaje{

@Id
@GenericGenerator(name="incrementmensaje", strategy="increment")
@GeneratedValue(generator="incrementmensaje")
@Column(name="mensajeId")
private int mensajeId;

@Column(name="texto")
@Type(type="text")
private String texto;

@Column(name="consultaId")
private int consultaId;

@Column(name="emisorId")
private int emisorId;

public Mensaje(){

}

public Mensaje(int mensajeId, String texto, int consultaId, int emisorId) {
    this.mensajeId = mensajeId;
    this.texto = texto;
    this.consultaId = consultaId;
    this.emisorId = emisorId;
}

public int getMensajeId() {
    return this.mensajeId;
}
public void setMensajeId(int id) {
    this.mensajeId = id;
}
public String getTexto() {
    return this.texto;
}
public void setTexto(String texto) {
    this.texto = texto;
}
public int getConsultaId() {
    return this.consultaId;
}
public void setConsultaId(int consultaId) {
    this.consultaId = consultaId;
}
public int getEmisorId() {
    return this.emisorId;
}
public void setEmisorId(int emisorId) {
    this.emisorId = emisorId;
}

}