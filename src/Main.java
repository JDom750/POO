import com.Cola.Cola;
import Lista.List;
import com.Parte_Juego.Jugador;
import com.Tareas.*;
import com.ListaDoblementeEnlazada.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import com.TADPila.*;
import org.w3c.dom.ls.LSOutput;

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


        System.out.println("\nProbando Listas\n");
        List myList = new List();

        // Test adding elements
        myList.L_agregar("Item 1");
        myList.L_agregar("Item 2");
        myList.L_agregar("Item 3");
//        myList.L_agregar("Item 3");
        myList.l_mostrar();

        // Test retrieving elements by position
        System.out.println("Element at position 1: " + myList.L_recuperar(1));
        System.out.println("Element at position 2: " + myList.L_recuperar(2));
        System.out.println("Element at position 3: " + myList.L_recuperar(3));

        // Test inserting an element at a specific position
        myList.l_insertar(2, "Inserted Item");
        System.out.println("After inserting, element at position 2: " + myList.L_recuperar(2));

        System.out.println("Element at position 1: " + myList.L_recuperar(1));
        System.out.println("Element at position 2: " + myList.L_recuperar(2));
        System.out.println("Element at position 3: " + myList.L_recuperar(3));

        myList.l_insertar(2, "Inserted Item");

        // Test removing an element
        myList.L_eliminar("Item 3");
        System.out.println("After removing 'Item 3', length: " + myList.L_longitud());

        // Test checking if the list is empty
        System.out.println("Is the list empty? " + myList.L_esVacio());

        myList.l_mostrar();

        System.out.println("Probando Tareas");

        Scanner scanner =  new Scanner(System.in);

        Lista_De_Tareas listaT = new Lista_De_Tareas(10);
        listaT.agregar_tarea("Ir al supermercado mañana", 1, Estado.INCOMPLETA, "2023-05-23");
        listaT.agregar_tarea("Consultar repuesto del auto", 1, Estado.COMPLETA, "2023-09-02");

        listaT.mostrar_lista_tareas();

        System.out.println("Ingrese el numero de tarea que desea modificar tarea que desea modificar: ");
        int n =scanner.nextInt();
        scanner.nextLine();
        Tareas t = listaT.devolverTarea(n);
        if (t==null){
            System.out.println("roghiafugyafisdugyiaufygaei");
        }
        System.out.println("\n1.Descripcion \n 2.Prioridad \n 3.Estado\n\nIngrese lo que desea modificar: ");
        int n1 = scanner.nextInt();
        scanner.nextLine();
        while (n1>3 || n1<1){
            System.out.println("Ingrese un valor valido (1-3): ");
            n1=scanner.nextInt();
            scanner.nextLine();
        }
        switch(n1){
            case 1:
                System.out.println("Ingrese una descripcion: ");
                String desc = scanner.nextLine();
                t.setDescripcion(desc);
                break;
            case 2:
                System.out.println("Ingrese una prioridad (un numero entero): ");
                int prio = scanner.nextInt();
                assert t != null;
                t.setPrioridad(prio);
                scanner.nextLine();
                break;
            case 3:
                System.out.println("Ingrese un estado: \n1.INCOMPLETA\n2.COMPLETA\n\n");
                int est = scanner.nextInt();
                if (est == 1) {
                    t.setEstado(Estado.INCOMPLETA);
                }
                else{
                    t.setEstado(Estado.COMPLETA);
                }
                break;
        }

        listaT.mostrar_lista_tareas();
        System.out.println();
        System.out.println("Probando Pila");
        System.out.println();

        // Create a new Pila object
        Pila pila = new Pila();

        // Push some elements onto the stack
        pila.p_apilar("Element 1");
        pila.p_apilar("Element 2");
        pila.p_apilar("Element 3");

        // Display the stack
        System.out.println("Stack contents:");
        pila.p_mostrarPila();

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + pila.p_esVacia());

        // Pop elements from the stack
        System.out.println("Popped element: " + pila.p_desapilar());
        System.out.println("Popped element: " + pila.p_desapilar());

        // Display the stack after popping elements
        System.out.println("Stack contents after popping:");
        pila.p_mostrarPila();

        // Check if the stack is empty again
        System.out.println("Is the stack empty? " + pila.p_esVacia());

        System.out.println();
        System.out.println("Probando ListasDoblementeEnlazadas");
        System.out.println();

        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        // Check if the list is empty
        System.out.println("Is the list empty? " + lista.L_esVacio());

        // Add some elements to the list
        lista.L_agregar("Element 1");
        lista.L_agregar("Element 2");
        lista.L_agregar("Element 3");

        // Check the length of the list
        System.out.println("Length of the list: " + lista.L_longitud());

        lista.l_mostrarListaD();

        // Retrieve and print elements at specific positions
        System.out.println("Element at position 2: " + lista.L_recuperar(2));

        // Insert an element at a specific position
        lista.L_insertar(2, "New Element");

        lista.l_mostrarListaD();

        // Retrieve and print elements at specific positions after insertion
        System.out.println("Element at position 2 after insertion: " + lista.L_recuperar(2));

        // Delete an element
        lista.L_eliminar("Element 1");

        lista.l_mostrarListaD();
        // Check the length of the list after deletion
        System.out.println("Length of the list after deletion: " + lista.L_longitud());

        // Check if the list is empty after operations
        System.out.println("Is the list empty? " + lista.L_esVacio());

        System.out.println();
        System.out.println();


    }
    }

