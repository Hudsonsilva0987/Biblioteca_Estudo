package com.biblioteca.controller;

import com.biblioteca.model.Livro;
import com.biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("Livros")
@RestController
public class LivroController {

    @Autowired
    private LivroService service;
    @PostMapping
    public ResponseEntity<Livro> save (@RequestBody Livro livro){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.salvar(livro));
    }

    @GetMapping
    public ResponseEntity<Livro>  findById(@RequestParam("id") Long id){
        return ResponseEntity.ok(service.findById(id));
    }
}
