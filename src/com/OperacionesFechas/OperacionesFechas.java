package com.OperacionesFechas;

import java.time.LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OperacionesFechas {
    private LocalDate fecha;

    public OperacionesFechas(String fechaStr, String formato) {
        if (formato.equals("dd-MM-yyyy")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            this.fecha = LocalDate.parse(fechaStr, formatter);
        } else if (formato.equals("MM-dd-yyyy")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
            this.fecha = LocalDate.parse(fechaStr, formatter);
        } else {
            throw new IllegalArgumentException("Formato de fecha no válido.");
        }
    }

    public boolean esMayorQue(OperacionesFechas otraFecha) {
        return this.fecha.isAfter(otraFecha.fecha);
    }

    public boolean esMenorQue(OperacionesFechas otraFecha) {
        return this.fecha.isBefore(otraFecha.fecha);
    }

    public boolean seEncuentraEnMedio(OperacionesFechas fecha1, OperacionesFechas fecha2) {
        return (this.fecha.isAfter(fecha1.fecha) && this.fecha.isBefore(fecha2.fecha)) ||
                (fecha1.fecha.isAfter(this.fecha) && fecha1.fecha.isBefore(fecha2.fecha));
    }

    public LocalDate getFecha() {
        return fecha;
    }

}

