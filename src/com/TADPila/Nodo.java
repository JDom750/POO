package com.TADPila;

public class Nodo {

    private Object dato = null;
    private Nodo siguiente = null;

    public void setDato(Object nuevoDato) {
        this.dato = nuevoDato;
    }

    public void setSiguiente(Nodo nodoSiguiente) {
        siguiente = nodoSiguiente;
    }

    public Object getDato() {
        return this.dato;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }
}

