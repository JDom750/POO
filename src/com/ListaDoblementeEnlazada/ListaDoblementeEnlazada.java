package com.ListaDoblementeEnlazada;

public class ListaDoblementeEnlazada {
    private class Iterador {
        private Node lista;
        private int posicion = 0;

        public void setLista(Node lista) {
            this.lista = lista;
        }

        public Node getListaInicio() {
            return this.lista;
        }

        public boolean haySiguiente() {
            return this.lista != null;
        }

        public Node proximoNodo() {
            if (this.lista == null) {
                return null;
            }
            Node aux = this.lista;
            this.lista = this.lista.getSiguiente();
            posicion++;
            return aux;
        }

        public int getPosicion() {
            return posicion;
        }
    }

    private Node inicio = null;
    private Node fin = null; // Reference to the last node


    public boolean L_esVacio() {
        return inicio == null;
    }

    public int L_longitud() {
        int i = 0;
        Node currentNode = inicio;

        while (currentNode != null) {
            i++;
            currentNode = currentNode.getSiguiente();
        }
        return i;
    }

    public void L_agregar(Object d) {
        Node nuevoNodo = new Node();
        nuevoNodo.setDato(d);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo; // Update the fin reference for the first node
        } else {
            nuevoNodo.setAnterior(fin); // Link the new node to the previous last node
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo; // Update the fin reference for the new last node
        }
    }

    public void L_eliminar(Object db) {
        Iterador iter = new Iterador();
        iter.setLista(inicio);

        while (iter.haySiguiente()) {
            Node currentNode = iter.proximoNodo();
            if (currentNode.getDato().equals(db)) {
                if (currentNode == inicio) {
                    inicio = currentNode.getSiguiente();
                    if (inicio != null) {
                        inicio.setAnterior(null);
                    }
                } else if (currentNode == fin) {
                    fin = currentNode.getAnterior();
                    if (fin != null) {
                        fin.setSiguiente(null);
                    }
                } else {
                    Node prevNode = currentNode.getAnterior();
                    Node nextNode = currentNode.getSiguiente();
                    prevNode.setSiguiente(nextNode);
                    nextNode.setAnterior(prevNode);
                }
            }
        }
        Node aux = iter.proximoNodo();
        if(aux !=null&&(aux.getDato().equals(db))){
            if (aux == inicio){
                this.inicio = null;
                this.fin = null;

            }
        }
    }

    public Object L_recuperar(int pos) {
        Iterador iter = new Iterador();
        iter.setLista(inicio);

        for (int i = 1; i < pos; i++) {
            if (iter.haySiguiente()) {
                iter.proximoNodo();
            }
            else if (iter.proximoNodo()!=null && (i+1 ==pos)){
                return iter.getListaInicio().getDato();
            }
            else {
                return null;
            }
        }
        return iter.getListaInicio().getDato();
    }

    public void L_insertar(int pos, Object j) {
        Iterador iter = new Iterador();
        iter.setLista(inicio);
        Node j_nodo = new Node();
        j_nodo.setDato(j);
        if (pos == 1) {
            j_nodo.setSiguiente(inicio);
            if (inicio != null) {
                inicio.setAnterior(j_nodo);
            }
            inicio = j_nodo;
            return;
        }
        Node aux = inicio;
        for (int i = 1; i < pos; i++) {
            if (iter.haySiguiente()) {
                aux = iter.proximoNodo();
            }
   //         else if(i+1 == pos){
   //             aux = iter.proximoNodo();
   //         }
            else {
                System.out.println("La lista no posee la posición: " + pos);
                return;
            }
        }
        j_nodo.setSiguiente(aux.getSiguiente());
        j_nodo.setAnterior(aux);
        if (aux.getSiguiente() != null) {
            aux.getSiguiente().setAnterior(j_nodo);}
        aux.setSiguiente(j_nodo);
    }

    public void l_mostrarListaD() {
        Node currentNode = inicio;
        if (inicio==null){
            System.out.println("Lista Vacia");
            return;
        }
        System.out.print("ListaD: ");
        while (currentNode != null) {
            System.out.print(currentNode.getDato() + "   ");
            currentNode = currentNode.getSiguiente();
        }
        System.out.println();
    }

}
