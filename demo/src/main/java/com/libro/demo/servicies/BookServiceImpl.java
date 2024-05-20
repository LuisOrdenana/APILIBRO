package com.libro.demo.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libro.demo.modelolibro.Libro;
import com.libro.demo.repositorio.BookRepositorio;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepositorio bookRepositorio;

    @Override
    public Libro getLibro(int id) {
        return bookRepositorio.getLibro(id);
    }

    @Override
    public List<Libro> getLibros() {
        return bookRepositorio.getLibros();
    }

    @Override
    public Libro nuevLibro(Libro libro) {
        return bookRepositorio.save(libro); // Asumiendo que 'save' es el método correcto en el repositorio para guardar un nuevo libro
    }
}
