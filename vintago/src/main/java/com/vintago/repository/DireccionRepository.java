package com.vintago.repository;

import com.vintago.entity.Direccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface DireccionRepository extends CrudRepository<Direccion, Integer>, Repository<Direccion, Integer> {

    List<Direccion> findByDistrito(String distrito);
    List<Direccion> findByCalle(String calle);
}
