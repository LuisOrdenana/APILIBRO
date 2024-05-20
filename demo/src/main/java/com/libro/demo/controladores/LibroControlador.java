package com.libro.demo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.libro.demo.modelolibro.Libro;
import com.libro.demo.servicies.BookService;

@RestController
public class LibroControlador {
    // @Autowired
    // private LibroRepository libroRepository;
    @Autowired
    private BookService bookService;

    @PostMapping("")
    public Libro nuevLibro(@RequestBody Libro libro){
        bookService.nuevLibro(libro);
        return libro;
    }

    @GetMapping("/libros/{id}")
    public Libro getLibro(@PathVariable int id){
        Libro libro = bookService.getLibro(id);
        return libro;
    }

    @GetMapping("/libros")
    public List<Libro> getLibros(){
        return bookService.getLibros();
    }
    
}
