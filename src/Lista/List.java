package Lista;

import java.net.StandardSocketOptions;

public class List {

    private class Iterador{
        private Node lista;
        private int posicion = 0;

        public void setLista(Node lista) {
            this.lista = lista;
        }
        public Node getLista(){
            return this.lista;
        }

        public boolean haySiguiente(){
            return this.lista.getSiguiente()!=null;
        }

        public Node proximoNodo(){
            Node aux = this.lista;
            this.lista = lista.getSiguiente();
            this.posicion++;
            return aux;
        }
    }

    private Node inicio = null;

    public boolean L_esVacio(){
        return this.inicio == null;
    }
    public int L_longitud() {
        int i = 0;
        Node currentNode = this.inicio;

        while (currentNode != null) {
            i++;
            currentNode = currentNode.getSiguiente();
        }

        return i;
    }


    public void L_agregar(Object d){
        Node a = new Node();
        a.setDatos(d);
        if (this.inicio==null){
            this.inicio=a;
        }else{
            Node aux = this.inicio;
            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(a);
        }
    }

    public void L_eliminar(Object db) {
        Iterador iter = new Iterador();
        iter.setLista(this.inicio);

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
        Node aux = iter.getLista();
        if (iter.proximoNodo() !=null && prevNode !=null){
            if (aux.getDatos().equals(db)){
                prevNode.setSiguiente(null);
            }
        }
    }

    public Object L_recuperar(int pos){
        Iterador iter = new Iterador();
        iter.setLista(this.inicio);
        Node r_aux = new Node();
        if (this.inicio ==null){
            return null;
        }
        else {
            for (int i = 0; i < pos; i++) {
                if (iter.haySiguiente()) {
                    r_aux = iter.proximoNodo();
                }else if (i==pos-1){
                    r_aux= iter.proximoNodo();
                }
                else {
                    return null;
                }
            }
        }
        return r_aux.getDatos();
    }

    public void l_insertar(int pos, Object j){
        Iterador iter = new Iterador();
        iter.setLista(this.inicio);
        Node j_nodo = new Node();
        j_nodo.setDatos(j);
        Node aux = this.inicio;
        for (int i=0;i<pos-1;i++){
            if(iter.haySiguiente()){
                aux = iter.proximoNodo();
            }
            else {
                System.out.println("La liste no posee la posicion: " + pos + " se insertara en la posicion " + (i + 1));
                break;
            }
        }
        j_nodo.setSiguiente(aux.getSiguiente());
        aux.setSiguiente(j_nodo);
    }

    public void l_mostrar(){
        Iterador iter = new Iterador();
        iter.setLista(this.inicio);
        if (inicio == null){
            System.out.println("La lista esta vacia");
            return;
        }else {
            int i = 1;
            while (iter.haySiguiente()) {
                Node aux = iter.proximoNodo();
                System.out.println("Nodo " + i + " : " + aux.getDatos());
                i++;
            }
            System.out.println("Nodo "+ i+" : "+ iter.getLista().getDatos());

        }
    }
}

