package com.LibroBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        // inicializo libros en el constructor
        this.libros = new ArrayList<>();
    }
    public void agregarLibro(Libro l){
        this.libros.add(l);
    }
    public Libro buscarLibroTitulo(String s){
        for (int i=0;i<libros.size();i++){
            if (libros.get(i).getTitulo().equals(s)){
                System.out.println("El libro "+libros.get(i).getTitulo()+" creado por el autor " +
                                libros.get(i).getAutor()+ " tiene "+libros.get(i).getPaginas()+" páginas, " +
                        "quedan " + libros.get(i).getCantEjemplares()+
                        " disponibles y se prestaron "+libros.get(i).getCantEjemplaresPrestados());

                return libros.get(i);
            }
        }
        return null;
    }

    public Libro buscarLibroAutor(String s){
        for (int i=0;i<libros.size();i++){
            if (libros.get(i).getAutor().equals(s)){
                System.out.println("El libro "+libros.get(i).getTitulo()+" creado por el autor " +
                        libros.get(i).getAutor()+ " tiene "+libros.get(i).getPaginas()+" páginas, " +
                        "quedan " + libros.get(i).getCantEjemplares()+
                        " disponibles y se prestaron "+libros.get(i).getCantEjemplaresPrestados());

                return libros.get(i);
            }
        }
        return null;
    }

    public void lConMasPaginas(Libro l1, Libro l2){
        if (l1.getPaginas()>l2.getPaginas()){
            System.out.println("El libro "+l1.getTitulo()+" tiene mas paginas");
        } else if (l1.getPaginas()<l2.getPaginas()) {
            System.out.println("El libro "+l2.getTitulo()+" tiene mas paginas");
        }else{
            System.out.println("Los libros tienen la misma cantidad de paginas");
        }
    }

    public void mostrarPrestamosTotales(){
        int j=0;
        for (int i=0;i<this.libros.size();i++){
            System.out.println("Libro: "+this.libros.get(i).getTitulo()+ " registra "+this.libros.get(i).getCantEjemplaresPrestados()+" cantidad de ejemplares prestados");
            j+=this.libros.get(i).getCantEjemplaresPrestados();
        }
        System.out.println("La cantidad total de ejemplares prestados es: "+j);
    }

}

