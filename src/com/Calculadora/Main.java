package com.Calculadora;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        ArrayList<Double> raices = calculadora.raices();
        System.out.println("Raíces: " + raices);

        System.out.println("Ingrese un valor para x para calcular el valor correspondiente de y:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double y = calculadora.valorY(x);
        System.out.println("Valor de la ecuación en x=" + x + ": " + y);
    }


}
