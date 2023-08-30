package com.ListaDoblementeEnlazada;

public class Node {
    private Object dato;

    private Node siguiente;

    private Node anterior;

    public void setDato(Object dato){
        this.dato = dato;
    }
    public Object getDato(){
        return this.dato;
    }

    public void setSiguiente(Node siguiente){
        this.siguiente = siguiente;
    }

    public Node getSiguiente(){
        return this.siguiente;
    }

    public void setAnterior(Node anterior){
        this.anterior = anterior;
    }

    public Node getAnterior(){
        return anterior;
    }
}
