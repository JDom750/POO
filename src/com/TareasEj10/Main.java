package com.TareasEj10;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Tareas tarea = new Tareas();
        tarea.setDescripcion("Tarea importante");
        tarea.setPrioridad(2);
        tarea.setFecha_Limite(LocalDate.of(2023, 9, 15));
        tarea.setFecha_Recordatorio(LocalDate.of(2023, 9, 10));

        System.out.println(tarea.toString());
    }

}
