package com.LibroBiblioteca;

public class Main {
    public static void main(String[] args){
        Libro l1 = new Libro();
        Libro l2 = new Libro();
        l1.altaLibro();
        l2.altaLibro();

        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(l1);
        biblio.agregarLibro(l2);
        biblio.buscarLibroTitulo(l1.getTitulo());
        biblio.buscarLibroTitulo(l2.getTitulo());
        biblio.lConMasPaginas(l1,l2);

        if(l1.prestar(1)){
            System.out.println("L1 pudo prestar 1 ejemplar");
        }else{
            System.out.println("L1 no se puede prestar ya que solo queda el ejemplar de muestra");
        }
        if(l2.prestar(10)){
            System.out.println("L2 pudo prestar 10 ejemplares");
        }else{
            System.out.println("L2 no puede prestar esa cantidad de ejemplares");
        }

        biblio.mostrarPrestamosTotales();

    }
}
