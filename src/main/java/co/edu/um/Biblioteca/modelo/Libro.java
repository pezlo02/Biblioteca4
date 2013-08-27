package co.edu.um.Biblioteca.modelo;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: OSCAR
 * Date: 26/08/13
 * Time: 01:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class Libro {

    private String isbn, titulo, autor ;
    private Date FechaPublicacion;
    private int NEjemplares;

    public Libro() {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        FechaPublicacion = FechaPublicacion;
        this.NEjemplares = NEjemplares;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechaPublicacion() {
        return FechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        FechaPublicacion = fechaPublicacion;
    }

    public int getNEjemplares() {
        return NEjemplares;
    }

    public void setNEjemplares(int NEjemplares) {
        this.NEjemplares = NEjemplares;
    }

    @Override
    public String toString() {
        return "[" + isbn + "]: " + titulo;
    }
}