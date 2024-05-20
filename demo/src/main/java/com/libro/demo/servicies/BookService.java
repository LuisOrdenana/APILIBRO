package com.libro.demo.servicies;

import java.util.List;

import com.libro.demo.modelolibro.Libro;

public interface BookService {
    Libro getLibro(int id);
    List<Libro> getLibros();
    Libro nuevLibro(Libro libro);

}
   

    