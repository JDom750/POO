package com.password;

import java.util.Random;

import java.util.Random;

public class GeneradorPassword {

    private String password;
    private int longuitud = 8;

    public String getPassword() {
        return password;
    }

    public int getLonguitud() {
        return longuitud;
    }

    public void setLonguitud(int longuitud) {
        this.longuitud = longuitud;
    }

    public GeneradorPassword() {
        regenerarPassword();
    }

    public boolean esFuerte(String password) {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        return mayusculas > 2 && minusculas > 1 && numeros > 1;
    }

    public void regenerarPassword() {
        Random r = new Random();
        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        String nros = "0123456789";

        StringBuilder sb = new StringBuilder();
        int numMayus = 0;
        int numMinus = 0;
        int numNros = 0;

        for (int i = 0; i < this.longuitud; i++) {
            int choice = r.nextInt(3); // 0 para mayúsculas, 1 para minúsculas, 2 para números
            char randomChar;

            switch (choice) {
                case 0:
                    if (numMayus < 3) {
                        randomChar = mayus.charAt(r.nextInt(mayus.length()));
                        numMayus++;
                    } else {
                        randomChar = nros.charAt(r.nextInt(nros.length()));
                        numNros++;
                    }
                    break;
                case 1:
                    if (numMinus < 2) {
                        randomChar = minus.charAt(r.nextInt(minus.length()));
                        numMinus++;
                    } else {
                        randomChar = nros.charAt(r.nextInt(nros.length()));
                        numNros++;
                    }
                    break;
                case 2:
                    if (numNros < 2) {
                        randomChar = nros.charAt(r.nextInt(nros.length()));
                        numNros++;
                    } else {
                        randomChar = mayus.charAt(r.nextInt(mayus.length()));
                        numMayus++;
                    }
                    break;
                default:
                    randomChar = ' '; // Esto no debería ocurrir
            }

            sb.append(randomChar);
        }

        this.password = sb.toString();

        if (!esFuerte(this.password)) {
            // Si la contraseña no es fuerte, se regenera hasta que lo sea.
            regenerarPassword();
        }
    }
}
