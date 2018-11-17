package com.vintago.service;

import com.vintago.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface ICategoriaService {

    List<Categoria> findByNombrecategoria(String nombreCategoria);

    Iterable<Categoria> findAll();
    Optional<Categoria> findById(int id);
    void delete(Categoria categoria);
    void deleteById(int id);
    boolean existsById(int id);
    Categoria save(Categoria categoria);
    Iterable<Categoria> saveAll(Iterable<Categoria> categorias);
}
