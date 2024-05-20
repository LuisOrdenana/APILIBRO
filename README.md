# Proyecto de Libros

Este proyecto consiste en una aplicación de gestión de libros desarrollada con Spring Boot.

## Características

El proyecto incluye las siguientes características:

- **Creación de la entidad Libro**: Se creó una nueva clase llamada `Libro` en el paquete `com.tuuniversidad.models`. Esta clase tiene los siguientes campos:
  - `id`: Long (ID del libro)
  - `titulo`: String (Título del libro)
  - `autor`: String (Autor del libro)
  - `editorial`: String (Editorial que publicó el libro)
  - `anioPublicacion`: Integer (Año de publicación)

- **Creación del repositorio**: Se creó un repositorio en el paquete `com.tuuniversidad.repository`. Este repositorio contiene objetos quemados de los libros.

- **Creación del servicio**: Se creó un servicio en el paquete `com.tuuniversidad.service`. Este servicio llama a una instancia del repositorio.

- **Creación del controlador**: Se creó un controlador en el paquete `com.tuuniversidad.controllers`. Este controlador tiene los siguientes endpoints:
  - `GET /libros`: Retorna una lista de todos los libros.
  - `GET /libros/{id_libro}`: Retorna un libro por el id.
  - `POST /libros`: Crea un nuevo recurso libro.

## Uso

Para utilizar la aplicación, puedes hacer uso de las siguientes URLs:

- Para crear un nuevo libro: `POST /libros`
- Para obtener un libro por su ID: `GET /libros/{id}`
- Para obtener una lista de todos los libros: `GET /libros`


<a href="https://postimg.cc/8sNdLtWv" target="_blank"><img src="https://i.postimg.cc/pVn0bSLs/Captura-de-pantalla-2024-05-19-205747.png" alt="Captura-de-pantalla-2024-05-19-205747"/></a><br/><br/>
<a href="https://postimg.cc/KRYnHj0v" target="_blank"><img src="https://i.postimg.cc/vHr3D699/Captura-de-pantalla-2024-05-19-205817.png" alt="Captura-de-pantalla-2024-05-19-205817"/></a><br/><br/>
<a href="https://postimg.cc/mhjYjCN5" target="_blank"><img src="https://i.postimg.cc/Fs5T9xfN/Captura-de-pantalla-2024-05-19-205900.png" alt="Captura-de-pantalla-2024-05-19-205900"/></a><br/><br/>
<a href="https://postimg.cc/9rNG52kP" target="_blank"><img src="https://i.postimg.cc/htKMmPbY/Captura-de-pantalla-2024-05-19-210110.png" alt="Captura-de-pantalla-2024-05-19-210110"/></a><br/><br/>
<a href="https://postimg.cc/4Y7pXMCD" target="_blank"><img src="https://i.postimg.cc/Vk4gWQKk/Captura-de-pantalla-2024-05-19-210129.png" alt="Captura-de-pantalla-2024-05-19-210129"/></a><br/><br/>
