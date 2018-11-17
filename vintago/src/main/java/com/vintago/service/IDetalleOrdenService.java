package com.vintago.service;

import com.vintago.entity.Detalleorden;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface IDetalleOrdenService {

    Iterable<Detalleorden> findAll();
    Optional<Detalleorden> findById(int id);
    void delete(Detalleorden adminn);
    void deleteById(int id);
    boolean existsById(int id);
    Detalleorden save(Detalleorden adminn);
    Iterable<Detalleorden> saveAll(Iterable<Detalleorden> admn);

}
