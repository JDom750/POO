package com.Cola;

public class Nodo {
    private Object dato;

    private Nodo anterior = null;

    private Nodo posterior = null;

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
        return this.dato;
    }

    public void setAnterior(Nodo anterior){
        this.anterior = anterior;
    }

    public Nodo getAnterior(){
        return this.anterior;
    }

    public void setPosterior(Nodo posterior){
        this.posterior = posterior;
    }

    public Nodo getPosterior(){
        return this.posterior;
    }

}
