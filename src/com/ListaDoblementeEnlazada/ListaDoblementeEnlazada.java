package com.ListaDoblementeEnlazada;

public class ListaDoblementeEnlazada {
    private class Iterador {
        private Node lista;
        private int posicion = 0;

        public void setLista(Node lista) {
            this.lista = lista;
        }

        public Node getListaInicio() {
            return lista;
        }

        public boolean haySiguiente() {
            return lista != null;
        }

        public Node proximoNodo() {
            Node aux = lista;
            lista = lista.getSiguiente();
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
    }

    public Object L_recuperar(int pos) {
        Iterador iter = new Iterador();
        iter.setLista(inicio);

        for (int i = 0; i < pos; i++) {
            if (iter.haySiguiente()) {
                iter.proximoNodo();
            } else {
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

        if (pos == 0) {
            j_nodo.setSiguiente(inicio);
            if (inicio != null) {
                inicio.setAnterior(j_nodo);
            }
            inicio = j_nodo;
            return;
        }

        Node aux = inicio;

        for (int i = 0; i < pos - 1; i++) {
            if (iter.haySiguiente()) {
                aux = iter.proximoNodo();
            } else {
                System.out.println("La lista no posee la posición: " + pos);
                return;
            }
        }

        j_nodo.setSiguiente(aux.getSiguiente());
        j_nodo.setAnterior(aux);
        if (aux.getSiguiente() != null) {
            aux.getSiguiente().setAnterior(j_nodo);
        }
        aux.setSiguiente(j_nodo);
    }
}
