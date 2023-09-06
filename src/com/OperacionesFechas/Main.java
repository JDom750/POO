package com.OperacionesFechas;

public class Main {
    public static void main(String[] args) {
        // Crear tres instancias de OperacionesFechas con fechas en formato "dd-MM-yyyy"
        OperacionesFechas fecha1 = new OperacionesFechas("15-09-2023", "dd-MM-yyyy");
        OperacionesFechas fecha2 = new OperacionesFechas("10-09-2023", "dd-MM-yyyy");
        OperacionesFechas fecha3 = new OperacionesFechas("20-09-2023", "dd-MM-yyyy");

        // Comprobar si fecha1 es mayor que fecha2
        boolean esMayor = fecha1.esMayorQue(fecha2);
        System.out.println("Fecha 1 es mayor que Fecha 2: " + esMayor);

        // Comprobar si fecha1 es menor que fecha3
        boolean esMenor = fecha1.esMenorQue(fecha3);
        System.out.println("Fecha 1 es menor que Fecha 3: " + esMenor);

        // Comprobar si fecha2 se encuentra entre fecha1 y fecha3
        boolean seEncuentraEnMedio = fecha2.seEncuentraEnMedio(fecha1, fecha3);
        System.out.println("Fecha 2 se encuentra entre Fecha 1 y Fecha 3: " + seEncuentraEnMedio);
    }

}
