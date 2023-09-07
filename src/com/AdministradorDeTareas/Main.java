package com.AdministradorDeTareas;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de TareasManager
        TareasManager manager = new TareasManager(50); // Capacidad de la lista de tareas

        // Agregar tareas
        manager.crearTarea("Tarea 1", 2, Estado.INCOMPLETA, "2023-09-15");
        manager.crearTarea("Tarea 2", 1, Estado.INCOMPLETA, "2023-09-20");
        manager.crearTarea("Tarea 3", 3, Estado.INCOMPLETA, "2023-09-10");
        manager.crearTarea("Tarea 4", 2, Estado.INCOMPLETA, "2023-09-30");
        manager.crearTarea("Tarea 5", 1, Estado.INCOMPLETA, "2023-09-25");

        // Marcar algunas tareas como realizadas
        Tareas tarea1 = manager.buscarTareaPorTitulo("Tarea 1");
        if (tarea1 != null) {
            manager.marcarTareaComoRealizada(tarea1);
        }

        Tareas tarea3 = manager.buscarTareaPorTitulo("Tarea 3");
        if (tarea3 != null) {
            manager.marcarTareaComoRealizada(tarea3);
        }

        // Mostrar tareas no vencidas ordenadas
        manager.mostrarTareasNoVencidasOrdenadas();
    }
}

