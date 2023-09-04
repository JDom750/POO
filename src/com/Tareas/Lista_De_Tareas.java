package com.Tareas;

import java.time.LocalDate;

public class Lista_De_Tareas {
    private Tareas[] lista_tareas;
    private int cantidadTareas;

    public Lista_De_Tareas(int capacidad) {
        lista_tareas = new Tareas[capacidad];
        cantidadTareas = 0;
    }

    public void agregar_tarea(String Descripcion, int Prioridad, Estado estado, String Fecha) {
        Tareas tarea = new Tareas();
        tarea.setEstado(estado);
        tarea.setDescripcion(Descripcion);
        LocalDate fecha = LocalDate.parse(Fecha);
        tarea.setFecha_Limite(fecha);
        tarea.setPrioridad(Prioridad);
        lista_tareas[cantidadTareas] = tarea;
        cantidadTareas = cantidadTareas + 1;
    }

    public void mostrar_lista_tareas() {
        System.out.println("Lista de tareas:");

        for (int i = 0; i < cantidadTareas; i++) {
            Tareas tarea = lista_tareas[i];
            System.out.println("Tarea " + (i + 1) + ":");
            System.out.println("Descripción: " + tarea.getDescripcion());
            System.out.println("Prioridad: " + tarea.getPrioridad());
            System.out.println("Estado: " + tarea.getEstado());
            System.out.println("Fecha Límite: " + tarea.getFecha_Limite());
            System.out.println("----------------------");
        }

    }

    public Tareas devolverTarea(int n) {
        if (n > 0 && n < cantidadTareas + 1) {
            return lista_tareas[n - 1];
        } else {
            System.out.println("Índice de tarea fuera de rango.");
            return null; // Return null or handle the out-of-bounds case as needed
        }
    }
}
