package com.vintago.repository;

import com.vintago.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>, Repository<Cliente, Integer> {
    List<Cliente> findByNombre(String nombre);
    List<Cliente> findByDni(String dni);
    List<Cliente> findByApellido(String apellido);
}