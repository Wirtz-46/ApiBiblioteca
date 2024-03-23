package com.biblioteca.apiBiblioteca.model;

public class Libro {
    private String editorial;
    private String isbn;
    private String autor;
    private String titulo;
    private String genero;

    public Libro() {
    }
    
    public Libro(String editorial, String isbn, String autor, String titulo, String genero) {
        this.editorial = editorial;
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
