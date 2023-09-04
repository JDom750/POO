package com.TADPila;

import javax.swing.*;

public class Pila {
    private Nodo tope =null;


    public void p_apilar(Object dato){
        Nodo nodoAux = new Nodo();
        nodoAux.setDato(dato);
        if (this.tope != null) {
            nodoAux.setSiguiente(this.tope);
        }
        this.tope = nodoAux;
    }
    public Object p_desapilar(){
        Nodo nodoAux;
        if(this.tope == null){
            return null;
        }
        nodoAux = tope;
        this.tope = nodoAux.getSiguiente();
        return nodoAux.getDato();
    }
    public boolean p_esVacia(){
        return tope == null;
    }

    public void p_mostrarPila(){
        Pila paux = new Pila();
        if (this.tope==null){
            System.out.println("Pila Vacia");
        } else {
            int i=0;
            while(this.tope !=null){
                i++;
                System.out.println("Elemento "+i+" : "+this.tope.getDato());
                paux.p_apilar(this.tope.getDato());
                this.tope=this.tope.getSiguiente();
            }
            while(!paux.p_esVacia()){
                this.p_apilar(paux.p_desapilar());
            }
        }
    }
}
