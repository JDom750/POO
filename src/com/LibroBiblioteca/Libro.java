package com.LibroBiblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int paginas;
    private int cantEjemplares;
    private String anio;
    private int cantEjemplaresPrestados = 0;

    public boolean Prestar(){
        if (cantEjemplares > 1){
            cantEjemplares--;
            cantEjemplaresPrestados++;
            return true;
        }else{
            return false;
        }
    }
    public boolean Prestar(int c){
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
}
