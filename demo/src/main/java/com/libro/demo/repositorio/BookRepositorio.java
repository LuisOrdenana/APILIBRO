package com.libro.demo.repositorio;

import java.util.List;

import com.libro.demo.modelolibro.Libro;

public interface BookRepositorio {
    Libro getLibro(int id);
    Libro nuevLibro(Libro libro);
    List<Libro> getLibros();
    Libro save(Libro libro);
  
}


