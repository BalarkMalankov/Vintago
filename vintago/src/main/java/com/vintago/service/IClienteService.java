package com.vintago.service;

import com.vintago.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {

    List<Cliente> findByNombre(String nombre);
    List<Cliente> findByDni(String dni);
    List<Cliente> findByApellido(String apellido);

    Iterable<Cliente> findAll();
    Optional<Cliente> findById(int id);
    void delete(Cliente cliente);
    void deleteById(int id);
    boolean existsById(int id);
    Cliente save(Cliente cliente);
    Iterable<Cliente> saveAll(Iterable<Cliente> clientes);
}
