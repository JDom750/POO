package com.Parte_Juego;

public class Main {
    //Cramos los Jugadores
    Jugador J1 = new Jugador("Luciano");
    Jugador J2 = new Jugador("Agustin");

    //Le asignamos una palabra
                    J1.Agregar_Palabra_Valida("Viaje");
                    J2.Agregar_Palabra_Valida("Kiwi");

    //Punteje final y Resultado del ganardo o empate.
                    J1.PuntajesValorTotal(J1,J2);
}
