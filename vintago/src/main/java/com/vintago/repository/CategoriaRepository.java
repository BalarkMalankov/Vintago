package com.vintago.repository;

import com.vintago.entity.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer>, Repository<Categoria, Integer> {

    List<Categoria> findByNombrecategoria(String nombreCategoria);

}
