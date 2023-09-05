package com.LibroBiblioteca;

import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn="";
    private int paginas=0;
    private int cantEjemplares=0;
    private String anio;
    private int cantEjemplaresPrestados = 0;

    public boolean prestar(){
        if (cantEjemplares > 1){
            cantEjemplares--;
            cantEjemplaresPrestados++;
            return true;
        }else{
            return false;
        }
    }
    public boolean prestar(int c){
        if (cantEjemplares > c){
            cantEjemplares=cantEjemplares-c;
            cantEjemplaresPrestados=cantEjemplaresPrestados+c;
            return true;
        }
        else{
            return false;
        }
    }

    public void devolver(){
        cantEjemplares++;
        cantEjemplaresPrestados--;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public void setPaginas(int paginas){
        this.paginas=paginas;
    }

    public int getPaginas(){
        return this.paginas;
    }

    public void setAnio(String anio){
        this.anio = anio;
    }

    public String getAnio(){
        return this.anio;
    }

    public void setCantEjemplares(int cantEjemplares){
        this.cantEjemplares = cantEjemplares;
    }
    public int getCantEjemplares(){
        return this.cantEjemplares;
    }

    public void setCantEjemplaresPrestados(int cantEjemplaresPrestados){
        this.cantEjemplaresPrestados=cantEjemplaresPrestados;
    }
    public int getCantEjemplaresPrestados(){
        return this.cantEjemplaresPrestados;
    }

    public Libro altaLibro(){
        System.out.println("Ingrese el titulo del Libro: ");
        Scanner s = new Scanner(System.in);
        this.setTitulo(s.nextLine());
        System.out.println("Ingrese el nombre del autor del libro: ");
        this.setAutor(s.nextLine());
        System.out.println("Ingrese el año de publicacion del libro: ");
        this.setAnio(s.nextLine());
        System.out.println("Ingrese la cantidad de ejemplares del libro: ");
        this.setCantEjemplares(s.nextInt());
        s.nextLine();
        System.out.println("Ingrese la cantidad de paginas del libro: ");
        this.setPaginas(s.nextInt());
        System.out.println("Desea Ingresar un ISBN?\n1.SI\n2.NO\n\n");
        if (s.nextInt()==1){
            s.nextLine();
            System.out.println("Ingrese el codigo de ISBN: ");
            this.setIsbn(s.nextLine());
        }else{
            System.out.println("OK");
        }
        return this;
    }
}
