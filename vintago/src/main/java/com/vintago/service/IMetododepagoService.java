package com.vintago.service;

import com.vintago.entity.Metododepago;

import java.util.Optional;

public interface IMetododepagoService {

    Iterable<Metododepago> findAll();
    Optional<Metododepago> findById(int id);
    void delete(Metododepago adminn);
    void deleteById(int id);
    boolean existsById(int id);
    Metododepago save(Metododepago adminn);
    Iterable<Metododepago> saveAll(Iterable<Metododepago> admn);
}
