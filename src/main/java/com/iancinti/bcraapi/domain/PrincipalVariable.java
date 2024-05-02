package com.iancinti.bcraapi.domain;

import java.time.LocalDateTime;

public class PrincipalVariable {
    private int idVariable;
    private int cdSerie;
    private String descripcion;
    private LocalDateTime fecha;
    private String valor;

    public int getIdVariable() {
        return idVariable;
    }

    public void setIdVariable(int idVariable) {
        this.idVariable = idVariable;
    }

    public int getCdSerie() {
        return cdSerie;
    }

    public void setCdSerie(int cdSerie) {
        this.cdSerie = cdSerie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
