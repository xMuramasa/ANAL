package com.Proyecto.Demo.Entidades;

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

@Column(name="mensaje")
@Type(type="text")
private String mensaje;

@Column(name="consultaId")
private int consultaId;

@Column(name="emisorId")
private int emisorId;

public Mensaje(){

}

public Mensaje(int mensajeId, String mensaje, int consultaId, int emisorId) {
    this.mensajeId = mensajeId;
    this.mensaje = mensaje;
    this.consultaId = consultaId;
    this.emisorId = emisorId;
}

public int getMensajeId() {
    return this.mensajeId;
}
public void setMensajeId(int id) {
    this.mensajeId = id;
}
public String getMensaje() {
    return this.mensaje;
}
public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
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