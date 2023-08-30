package com.Cola;

public class Cola {

    private Nodo frente=null;

    private Nodo fin = null;

    public void c_enconlar(Object a){
        Nodo aux = new Nodo();
        aux.setDato(a);
        if (this.fin == null && this.frente==null){
            this.fin = aux;
            this.frente = aux;
        }
        else{
            this.fin.setPosterior(aux);
            this.fin = aux;
        }
    }

    public Object desencolar() {
        if (this.frente == null) {
            // La cola está vacía, no hay elementos para desencolar
            return null; // Puedes elegir otro valor para indicar que la cola está vacía
        }

        Nodo nodoDesencolado = this.frente;
        this.frente = nodoDesencolado.getPosterior();

        if (this.frente == null) {
            // La cola ahora está vacía, también actualizamos 'fin'
            this.fin = null;
        }

        return nodoDesencolado.getDato();
    }

    public boolean estaVacia() {
        return this.frente == null;
    }

    public void mostrarCola() {
        Nodo actual = this.frente;
        while (actual != null) {
            System.out.print(actual.getDato() + " ");
            actual = actual.getPosterior();
        }
        System.out.println(); // Salto de línea al final para mejorar la visualización
    }

    public Object obtenerFrente() {
        if (this.frente == null) {
            return null; // Puedes elegir otro valor para indicar que la cola está vacía
        }
        return this.frente.getDato();
    }

}
