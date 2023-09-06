package com.password;

public class Main {
    public static void main(String[] args) {
        GeneradorPassword generador = new GeneradorPassword();
        System.out.println("Contraseña generada: " + generador.getPassword());
        System.out.println("Longitud de la contraseña: " + generador.getLonguitud());

        // Cambiar la longitud de la contraseña
        generador.setLonguitud(10);
        generador.regenerarPassword();
        System.out.println("Nueva contraseña generada: " + generador.getPassword());
        System.out.println("Nueva longitud de la contraseña: " + generador.getLonguitud());
    }
}

