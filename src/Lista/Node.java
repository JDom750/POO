package Lista;

public class Node {
    private Node siguiente = null;
    private Object datos;

    public void setSiguiente(Node nodo) {
        this.siguiente = nodo;
    }
    public  Node getSiguiente(){
        return siguiente;
    }
    public void setDatos(Object datos){
        this.datos = datos;

    }
    public Object getDatos(){
        return datos;
    }
}

