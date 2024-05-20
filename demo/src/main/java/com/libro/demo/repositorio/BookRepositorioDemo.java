package com.libro.demo.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.libro.demo.modelolibro.Libro;

public class BookRepositorioDemo implements BookRepositorio {

        private List<Libro> libros = new ArrayList<>();


    public BookRepositorioDemo(){
        libros.add(new Libro(1, "Orgullo y prejuicio", "Jane Austen", "T.Egerton,Whitehall", 1813));
        libros.add(new Libro(2, "Harry Potter y la piedra filosofal", "J. K. Rowling", "Salamandra",1997));
        libros.add(new Libro(3, "Harry Potter y la piedra filosofal", "Suzanne Collins", "Scholastic",2008));
        libros.add(new Libro(4, "Crepúsculo", "Stephenie Meyer", "Katherine Tegen Books", 2011));
        libros.add(new Libro(5, "Divergente", "Veronica Roth", "Bloomsbury Scholastic",2022));
        libros.add(new Libro(6, "1984", "George Orwell", "Secker & Warburg",2022));
    }

    public Libro getLibro(int id){
        System.out.println("Conectado a base de datos ORACLE");
        for(Libro libro: libros){
            if(id == libro.getId())
                return libro;

        }

        return null;
    }

    public List<Libro> getLibros(){
        System.out.println("Conexión establecida a la base de datos Oracle");
        return libros;
    }

    @Override
    public Libro nuevLibro(Libro libro) {

        throw new UnsupportedOperationException("Unimplemented method 'nuevLibro'");
    }

    @Override
    public Libro save(Libro libro) {
        libros.add(libro);
        return libro;
    }

}

