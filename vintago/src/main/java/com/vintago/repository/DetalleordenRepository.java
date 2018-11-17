package com.vintago.repository;

import com.vintago.entity.Detalleorden;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface DetalleordenRepository extends CrudRepository<Detalleorden, Integer>, Repository<Detalleorden, Integer> {

}
