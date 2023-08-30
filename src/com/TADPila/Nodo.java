package com.TADPila;

public class Nodo {

    private Object dato;
    private Nodo siguiente = null;

    public void setValor(Object nuevoDato){
        dato = nuevoDato;
    }

    public void setSiguiente(Nodo nodoSiguiente){
        siguiente = nodoSiguiente;
    }

    public Object getValor(){
        return dato;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public Object dato(){
        return dato;
    }
}
