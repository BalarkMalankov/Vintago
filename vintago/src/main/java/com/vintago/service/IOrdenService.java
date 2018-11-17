package com.vintago.service;

import com.vintago.entity.Orden;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IOrdenService {

    List<Orden> findByFechaorden(Date fechaOrden);
    List<Orden> findByFechaentrega(Date fechaEntrega);
    List<Orden> findByFecharecibida(Date fechaRecibida);
    List<Orden> findByNumeroorden(int numerOrden);

    Iterable<Orden> findAll();
    Optional<Orden> findById(int id);
    void delete(Orden adminn);
    void deleteById(int id);
    boolean existsById(int id);
    Orden save(Orden adminn);
    Iterable<Orden> saveAll(Iterable<Orden> admn);


    //logica del negociooo

}
