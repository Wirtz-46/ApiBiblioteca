package com.biblioteca.apiBiblioteca.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.biblioteca.apiBiblioteca.model.Libro;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/libros")
public class biblioteca {
    private List<Libro> libros;

    public biblioteca(){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Libro[] librosArrays = objectMapper.readValue(new ClassPathResource("libros.json").getFile(), Libro[].class);
            libros = new ArrayList<>(Arrays.asList(librosArrays));
        } catch (IOException e) {
            e.printStackTrace();
            libros = new ArrayList<>();
        }
    }

    @GetMapping
    public List<Libro> getAlllibros(){
        return libros;
    }
    
    @GetMapping("/{isbn}")
    public Libro getlibroByIsbn(@PathVariable String isbn){
        return libros.stream()
                .filter(libro -> libro.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
    }
    
    @PostMapping
    public Libro createLibro(@RequestBody Libro libro){
        libros.add(libro);
        return libro;
    }

    @PutMapping("/{isbn}")
    public Libro updateLibro(@PathVariable String isbn, @RequestBody Libro updaLibro){
        Libro libro = getlibroByIsbn(isbn);
        if (libro != null) {
            libro.setEditorial(updaLibro.getEditorial());
            libro.setAutor(updaLibro.getAutor());
            libro.setTitulo(updaLibro.getTitulo());
            libro.setGenero(updaLibro.getGenero());           
            return libro;
        }
        return null;
    }

    @DeleteMapping("/{isbn}")
    public void deleteLibro(@PathVariable String isbn){
        libros.removeIf(libro -> libro.getIsbn().equals(isbn));
    }
}
