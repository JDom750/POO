import com.Cola.*;
public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();

        System.out.println("¿La cola está vacía? " + cola.estaVacia());

        cola.c_enconlar(10);
        cola.c_enconlar(20);
        cola.c_enconlar(30);

        System.out.println("¿La cola está vacía? " + cola.estaVacia());

        System.out.println("Elemento del frente: " + cola.obtenerFrente());

        System.out.println("Mostrando la cola:");
        cola.mostrarCola();

        System.out.println("Desencolando elementos:");
        while (!cola.estaVacia()) {
            System.out.println("Desencolado: " + cola.desencolar());
        }

        System.out.println("¿La cola está vacía? " + cola.estaVacia());
    }
}
