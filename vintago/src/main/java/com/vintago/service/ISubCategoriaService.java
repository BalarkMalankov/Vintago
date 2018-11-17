package com.vintago.service;

import com.vintago.entity.SubCategoria;

import java.util.List;
import java.util.Optional;

public interface ISubCategoriaService {

    List<SubCategoria> findByNombresubcategoria(String nombreCategoria);

    Iterable<SubCategoria> findAll();
    Optional<SubCategoria> findById(int id);
    void delete(SubCategoria adminn);
    void deleteById(int id);
    boolean existsById(int id);
    SubCategoria save(SubCategoria adminn);
    Iterable<SubCategoria> saveAll(Iterable<SubCategoria> admn);
}
