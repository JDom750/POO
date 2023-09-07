package com.Parte_Juego;

public class Main {
    public static void main(String[] args) {
        // Creamos los Jugadores
        Jugador J1 = new Jugador("Joaquin");
        Jugador J2 = new Jugador("Martin");

        // Le asignamos una palabra
        J1.Agregar_Palabra_Valida("Viaje");
        J2.Agregar_Palabra_Valida("Kiwi");

        // Punteje final y resultado del ganador o empate.
        J1.PuntajesValorTotal(J1, J2);
    }
}

