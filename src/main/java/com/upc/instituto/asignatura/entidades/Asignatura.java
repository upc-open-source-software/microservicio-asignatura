package com.upc.instituto.asignatura.entidades;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "TBL_ASIGNATURA")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Long codigo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "creditos")
    private String creditos;

    @Column(name = "duracion")
    private Integer duracion;

    @Column(name = "contenido")
    private String contenido;

    @Column(name = "costo", precision = 10, scale = 2)
    private BigDecimal costo;

    public Asignatura(Long codigo, String nombre, String creditos, Integer duracion, String contenido, BigDecimal costo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.duracion = duracion;
        this.contenido = contenido;
        this.costo = costo;
    }

    public Asignatura(){

    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }
}
