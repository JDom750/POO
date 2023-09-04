package Lista;

public class Node {
    private Node siguiente = null;
    private Object datos = null;

    public void setSiguiente(Node nodo) {
        this.siguiente = nodo;
    }
    public  Node getSiguiente(){
        return this.siguiente;
    }
    public void setDatos(Object datos){
        this.datos = datos;
    }
    public Object getDatos(){
        return this.datos;
    }
}

