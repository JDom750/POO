package com.UltimoToDoList;

import java.time.LocalDate;

public class Tareas {
    private String Descripcion;
    private int Prioridad;
    private LocalDate Fecha_Limite ;

    private Estado estado;

    private LocalDate fechaFinalizacion;
    private String colaborador;

    public Tareas() {
        // ... inicialización de otros atributos
        fechaFinalizacion = null;
        colaborador = null;
    }

    public void marcarTareaComoRealizada(String colaborador) {
        if (estado == Estado.INCOMPLETA) {
            estado = Estado.COMPLETA;
            fechaFinalizacion = LocalDate.now();
            this.colaborador = colaborador;
        }
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public String getColaborador() {
        return colaborador;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(int prioridad) {
        Prioridad = prioridad;
    }

    public LocalDate getFecha_Limite() {
        return Fecha_Limite;
    }

    public void setFecha_Limite(LocalDate fecha_Limite) {
        this.Fecha_Limite = fecha_Limite;
    }
}
