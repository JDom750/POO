package com.UltimoToDoList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de TareasManager
        TareasManager manager = new TareasManager(50); // Capacidad de la lista de tareas

        // Agregar tareas
        manager.crearTarea("Tarea 1", 2, Estado.INCOMPLETA, "2023-09-15");
        manager.crearTarea("Tarea 2", 1, Estado.INCOMPLETA, "2023-09-20");
        manager.crearTarea("Tarea 3", 3, Estado.INCOMPLETA, "2023-09-10");

        // Marcar tareas como realizadas por colaboradores
        manager.marcarTareaComoRealizadaPorColaborador(manager.buscarTareaPorTitulo("Tarea 1"), "Colaborador A");
        manager.marcarTareaComoRealizadaPorColaborador(manager.buscarTareaPorTitulo("Tarea 2"), "Colaborador B");

        // Obtener tareas realizadas por un colaborador específico
        String colaboradorA = "Colaborador A";
        String colaboradorB = "Colaborador B";
        List<Tareas> tareasRealizadasPorA = manager.obtenerTareasRealizadasPorColaborador(colaboradorA);
        List<Tareas> tareasRealizadasPorB = manager.obtenerTareasRealizadasPorColaborador(colaboradorB);

        // Mostrar tareas realizadas por colaboradores
        System.out.println("Tareas realizadas por " + colaboradorA + ":");
        for (Tareas tarea : tareasRealizadasPorA) {
            System.out.println("Tarea: " + tarea.getDescripcion() + ", Fecha de Finalización: " + tarea.getFechaFinalizacion());
        }

        System.out.println("\nTareas realizadas por " + colaboradorB + ":");
        for (Tareas tarea : tareasRealizadasPorB) {
            System.out.println("Tarea: " + tarea.getDescripcion() + ", Fecha de Finalización: " + tarea.getFechaFinalizacion());
        }
    }
}

