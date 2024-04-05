# API de Biblioteca con Spring Boot

Esta API desarrollada con Spring Boot permite administrar libros utilizando el protocolo HTTP.

## Ejecutar el Proyecto:
Para utilizar esta API, asegúrate de tener instalado Java y Maven. Clona el repositorio y ejecuta la aplicación Spring Boot localmente. La API estará disponible en [http://localhost:8080/api/libros.]

### Uso
Puedes probar la API utilizando herramientas como Postman, y si usas VSC, con Thunder Client.

## Ejemplos

### Obtener todos los libros
```
GET /api/libros
```
Devuelve una lista de todos los libros en la biblioteca.

### Obtener un libro por ISBN
```
GET /api/libros/{isbn}
```
Devuelve los detalles de un libro específico basado en su ISBN.

### Crear un nuevo libro
```
POST /api/libros
```
Devuelve una lista de todos los libros en la biblioteca.

Body de ejemplo (JSON):
```json
{
  "isbn": "978-3-16-148410-0",
  "titulo": "Ejemplo de Libro",
  "autor": "Autor Ejemplo",
  "editorial": "Editorial Ejemplo",
  "genero": "Género Ejemplo"
}
```
### Actualizar un libro existente
```
PUT /api/libros/{isbn}
```
Actualiza los detalles de un libro existente basado en su ISBN.

Body de ejemplo (JSON):
```json
{
  "titulo": "Nuevo Título",
  "autor": "Nuevo Autor",
  "editorial": "Nueva Editorial",
  "genero": "Nuevo Género"
}
```

### Eliminar un libro
```
DELETE /api/libros/{isbn}
```
Elimina un libro de la biblioteca según su ISBN.
