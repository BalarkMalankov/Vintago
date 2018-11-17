package com.vintago.repository;

import com.vintago.entity.Orden;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.Date;
import java.util.List;

public interface OrdenRepository extends CrudRepository<Orden, Integer>, Repository<Orden, Integer> {

    List<Orden> findByFechaorden(Date fechaOrden);
    List<Orden> findByFechaentrega(Date fechaEntrega);
    List<Orden> findByFecharecibida(Date fechaRecibida);
    List<Orden> findByNumeroorden(int numerOrden);
}
