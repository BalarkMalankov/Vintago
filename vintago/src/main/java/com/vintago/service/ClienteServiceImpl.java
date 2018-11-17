package com.vintago.service;


import com.vintago.entity.Cliente;
import com.vintago.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements IClienteService{

    @Autowired
    ClienteRepository repository;

    /**
     *
     * @param nombre es un string que contiene el nombre del cliente
     * @return retorna una lista que contendrá a los clientes filtrado por nombre
     */
    @Override
    public List<Cliente> findByNombre(String nombre) {
        return repository.findByNombre(nombre);
    }

    /**
     *
     * @param dni dni es un string que contiene el numero de dni de cada cliente
     * @return retorna una lista que contendra a los clientes filtrados por dni
     */
    @Override
    public List<Cliente> findByDni(String dni){

        return repository.findByDni(dni);
    }

    /**
     *
     * @param apellido apellido es un String que contiene el apellido de cada cliente
     * @return retorna una lista que contendra a los clientes filtrados por apellido
     */
    @Override
    public  List<Cliente> findByApellido(String apellido){

        return repository.findByApellido(apellido);
    }

    /**
     *
     * @return retorna un Iterable de clientes que usaremos en un foreach para mostrar todos los usuarios clientes.
     */
    @Override
    public Iterable<Cliente> findAll() {
        return repository.findAll();
    }

    /**
     *
     * @param id id del cliente que usaremos para encontrar al cliente por id
     * @return retorna un Optional del cliente con el id seleccionado
     */

    @Override
    public Optional<Cliente> findById(int id) {
        return repository.findById(id);
    }

    /**
     *
     * @param cliente cliente de la de clase Cliente
     */

    @Override
    public void delete(Cliente cliente) {
        repository.delete(cliente);
    }

    /**
     *
     * @param id id elegido para ser eliminado
     */
    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    /**
     *
     * @param id id que verificará si existe o no
     * @return devuelve un booleano true (existe) or false(no existe)
     */
    @Override
    public boolean existsById(int id) {
        return repository.existsById(id);
    }

    /**
     *
     @param cliente categoria perteneciente a la clase Categoria
      * @return retorna un objeto de la clase categoria a ser guardada
     */
    @Override
    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    /**
     *
     * @param clientes clientes es el obejto pertenciente al collection Iterable que contiene a la clase Cliente
     * @return retorna un Iterable que contendrá a la clase Cliente que será usada en un foreach para su guardado
     */

    @Override
    public Iterable<Cliente> saveAll(Iterable<Cliente> clientes) {
        return repository.saveAll(clientes);

    }


}
