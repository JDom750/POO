package com.TADPila;

public class Pila {
    private Nodo tope;
    public Pila(){
        tope = null;
    }

    public void apilar(Object dato){
        Nodo nodoAux = new Nodo();
        nodoAux.setValor(dato);
        if (!esVacia()) {
            nodoAux.setSiguiente(tope);
        }
        tope = nodoAux;
    }

    public Object desapilar(){
        Nodo nodoAux;
        if(esVacia()){
            return null;
        }

        nodoAux = tope;
        tope = nodoAux.getSiguiente();
        return nodoAux.getValor();
    }

    public Object recuperar(){
        return tope.getValor();
    }

  /*  public int largoPila(){
        return cantidad;
    } */

    public boolean esVacia(){
        return tope == null;
    }

    public void mostrarPila(){
        if (this.esVacia()){
            System.out.println("pila vacia");
        } else {
            System.out.println("asd");
        }
    }
}
