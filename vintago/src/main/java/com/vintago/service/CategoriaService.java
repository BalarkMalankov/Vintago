package com.vintago.service;

import com.vintago.entity.Categoria;
import com.vintago.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CategoriaService implements ICategoriaService {

    @Autowired
    CategoriaRepository repository;

    /**
     *
     * @param nombreCategoria nombreCategoria es un string, que representa el nombre de la categoria
     * @return retorna una lista de las categorias filtradas por nombre
     */

    @Override
    public List<Categoria> findByNombrecategoria(String nombreCategoria) {
        return repository.findByNombrecategoria(nombreCategoria);
    }

    /**
     *
     * @return retorna un iterable de categorias
     */

    @Override
    public Iterable<Categoria> findAll() {
        return repository.findAll();
    }

    /**
     *
     * @param id id de la categoria
     * @return retorna un Optional que contendra la categoria elegida
     */
    @Override
    public Optional<Categoria> findById(int id) {
        return repository.findById(id);
    }

    /**
     *
     * @param categoria objeto de la clase categoria elegida a ser eliminada
     */
    @Override
    public void delete(Categoria categoria) {
        repository.delete(categoria);
    }

    /**
     *
     * @param id id elegido a ser eliminado
     */
    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    /**
     *
     * @param id id elegido para ser comprobado si existe o no
     * @return retorna un booleano true(existe) or false(no existe)
     */
    @Override
    public boolean existsById(int id) {
     return  repository.existsById(id);
    }

    /**
     *
     * @param categoria categoria perteneciente a la clase Categoria
     * @return retorna un objeto de la clase categoria a ser guardada
     */
    @Override
    public Categoria save(Categoria categoria) {
        return repository.save(categoria);
    }

    /**
     *
     * @param categorias categorias es el obejto pertenciente al collection Iterable que contiene a la clase Categoria
     * @return retorna un Iterable que contendrá a la clase Categoria que será usada en un foreach para su guardado
     */
    @Override
    public Iterable<Categoria> saveAll(Iterable<Categoria> categorias) {
        return repository.saveAll(categorias);

    }
}

