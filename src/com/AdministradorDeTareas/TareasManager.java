package com.AdministradorDeTareas;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class TareasManager {
    private Lista_De_Tareas listaTareas;

    public TareasManager(int capacidad) {
        listaTareas = new Lista_De_Tareas(capacidad);
    }

    public void crearTarea(String Descripcion, int Prioridad, Estado estado, String Fecha) {
        listaTareas.agregar_tarea(Descripcion, Prioridad, estado, Fecha);
    }

    public void mostrarTareas() {
        listaTareas.mostrar_lista_tareas();
    }

    public Tareas buscarTareaPorTitulo(String titulo) {
        for (Tareas tarea : listaTareas.getLista_tareas()) {
            if (tarea.getDescripcion().equalsIgnoreCase(titulo)) {
                return tarea;
            }
        }
        System.out.println("Tarea no encontrada.");
        return null;
    }

    public void marcarTareaComoRealizada(Tareas tarea) {
        if (tarea != null) {
            tarea.setEstado(Estado.COMPLETA);
            System.out.println("Tarea marcada como realizada: " + tarea.getDescripcion());
        }
    }

    public void mostrarTareasNoVencidasOrdenadas() {
        Tareas[] tareasNoVencidas = Arrays.stream(listaTareas.getLista_tareas())
                .filter(tarea -> !tarea.getFecha_Limite().isBefore(LocalDate.now()))
                .toArray(Tareas[]::new);

        Arrays.sort(tareasNoVencidas, Comparator.comparingInt(Tareas::getPrioridad)
                .thenComparing(Tareas::getFecha_Limite));

        System.out.println("Tareas no vencidas ordenadas por prioridad y fecha:");
        for (int i = 0; i < tareasNoVencidas.length; i++) {
            Tareas tarea = tareasNoVencidas[i];
            System.out.println("Tarea " + (i + 1) + ":");
            System.out.println("Descripción: " + tarea.getDescripcion());
            System.out.println("Prioridad: " + tarea.getPrioridad());
            System.out.println("Estado: " + tarea.getEstado());
            System.out.println("Fecha Límite: " + tarea.getFecha_Limite());
            System.out.println("----------------------");
        }
    }
}

