package Lista;

import java.net.StandardSocketOptions;

public class List {

    private class Iterador{
        private Node lista;
        private int posicion = 0;

        public void setLista(Node lista) {
            this.lista = lista;
        }

        public Node getListaInicio(){
            return lista;
        }

        public boolean haySiguiente(){
            return lista.getSiguiente()!=null;
        }

        public Node proximoNodo(){
            Node aux = new Node();
            aux = lista;
            this.lista = lista.getSiguiente();
            posicion++;
            return aux;
        }

        public int getPosicion(){
            return posicion;
        }


    }

    private Node inicio = null;

    public Node L_Crear(){
        return inicio;
    }
    public boolean L_esVacio(){
        return this.inicio == null;
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


    public void L_agregar(Object d){
        Node nuevoNodo = new Node();
        nuevoNodo.setDatos(d);
        if (inicio == null){
            this.inicio = nuevoNodo;
        }
        else{
            this.inicio.setSiguiente(nuevoNodo);
        }
    }

    public void L_eliminar(Object db) {
        Iterador iter = new Iterador();
        iter.setLista(inicio);

        // Handle the case where the first node(s) match the data
        while (inicio != null && inicio.getDatos().equals(db)) {
            inicio = inicio.getSiguiente();
        }

        Node prevNode = inicio;  // The node before the one being checked

        while (iter.haySiguiente() && prevNode != null) {
            Node currentNode = iter.proximoNodo();
            if (currentNode.getDatos().equals(db)) {
                prevNode.setSiguiente(currentNode.getSiguiente());  // Link previous node to the next one
            } else {
                prevNode = currentNode;  // Move to the next node only if the current one is not removed
            }
        }
    }

    public Object L_recuperar(int pos){
        Iterador iter = new Iterador();
        iter.setLista(inicio);
        Node r_aux = new Node();
        for (int i = 0; i<pos;i++){
            if (iter.haySiguiente()){
                r_aux = iter.proximoNodo();
            }
            else{
                return null;
            }
        }
        return r_aux.getDatos();
    }

    public void l_insertar(int pos, Object j){
        Iterador iter = new Iterador();
        iter.setLista(inicio);
        Node j_nodo = new Node();
        j_nodo.setDatos(j);
        Node aux = new Node();
        aux = inicio;
        for (int i=0;i<pos-1;i++){
            if(iter.haySiguiente()){
                aux = iter.proximoNodo();
            }
            else {
                System.out.println("La liste no posee la posicion: " + pos);
                break;
            }
        }
        j_nodo.setSiguiente(aux.getSiguiente());
        aux.setSiguiente(j_nodo);
    }
}

