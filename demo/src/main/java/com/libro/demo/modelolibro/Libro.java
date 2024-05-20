package com.libro.demo.modelolibro;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String editorial;
    private Integer anioPublicacion;
    public Libro() {}

    public Libro(int id, String titulo, String autor, String editorial, Integer anioPublicacion) {
		    super();
		    this.id = id;
		    this.titulo = titulo;
		    this.autor = autor;
		    this.editorial = editorial;
		    this.anioPublicacion = anioPublicacion;
	}
    public int getId() {
      return id;
    }
    
    public void setId(int id) {
        this.id = id;
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
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
      this.editorial = editorial;
    }

    public Integer getAniopublicacion() {
        return anioPublicacion;
    }

    public void setAniopublicacin(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    

}
