package com.vintago.service;

import com.vintago.entity.Direccion;

import java.util.List;
import java.util.Optional;

public interface IDireccionService {


    List<Direccion> findByDistrito(String distrito);
    List<Direccion> findByCalle(String calle);

    Iterable<Direccion> findAll();
    Optional<Direccion> findById(int id);
    void delete(Direccion adminn);
    void deleteById(int id);
    boolean existsById(int id);
    Direccion save(Direccion adminn);
    Iterable<Direccion> saveAll(Iterable<Direccion> admn);
}
