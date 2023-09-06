package com.TareasEj10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Tareas {
    private String Descripcion;
    private int Prioridad;
    private LocalDate Fecha_Limite;
    private LocalDate Fecha_Recordatorio; // Nueva fecha de recordatorio

    private Estado estado;

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

    public LocalDate getFecha_Recordatorio() {
        return Fecha_Recordatorio;
    }

    public void setFecha_Recordatorio(LocalDate fecha_Recordatorio) {
        this.Fecha_Recordatorio = fecha_Recordatorio;
    }

    // Método para verificar si la tarea está próxima a vencer
    public boolean estaProximaAVencer() {
        if (Fecha_Recordatorio != null) {
            LocalDate fechaActual = LocalDate.now();
            return !Fecha_Limite.isBefore(fechaActual) && !Fecha_Recordatorio.isAfter(Fecha_Limite);
        }
        return false;
    }

    // Método para imprimir la tarea con el prefijo "(por vencer)" si es necesario
    @Override
    public String toString() {
        String tareaString = Descripcion + " (Prioridad: " + Prioridad + ", Fecha Limite: " + Fecha_Limite;

        if (estaProximaAVencer()) {
            tareaString += " (por vencer)";
            Prioridad = 1; // Establecer la prioridad más alta si está próxima a vencer
        }

        tareaString += ")";

        return tareaString;
    }
}



