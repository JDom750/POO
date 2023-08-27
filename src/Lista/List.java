package Lista;

public class List {
    private Node inicio = null;

    public Node L_Crear(){
        return inicio;
    }
    public boolean L_esVacio(){
        return this.inicio == null;
    }
    public int L_longuitud(){
        int i=0;
        if (this.inicio == null){
            return 0;
        }
        else{
            i++;
            while (inicio.getSiguiente()!=null){
                this.inicio = inicio.getSiguiente();
                i++;
            }
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

    public void L_eliminar(int )
}
