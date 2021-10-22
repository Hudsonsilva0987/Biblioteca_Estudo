package com.biblioteca.service;

import com.biblioteca.model.Livro;
import com.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    public Livro salvar(Livro livro){
        return repository.save(livro);
    }

    public Livro findById(long id){
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Erro ao buscar pelo id: " + id));
    }
}
