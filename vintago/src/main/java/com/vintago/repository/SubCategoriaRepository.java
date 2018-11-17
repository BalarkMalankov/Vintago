package com.vintago.repository;

import com.vintago.entity.SubCategoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface SubCategoriaRepository extends CrudRepository<SubCategoria, Integer>, Repository<SubCategoria, Integer> {

    List<SubCategoria> findByNombresubcategoria(String nombreCategoria);
}