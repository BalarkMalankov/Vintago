package com.vintago.service;

import com.vintago.entity.Adminn;
import com.vintago.repository.AdminnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminnServiceImpl implements IAdminnService {

    @Autowired
    AdminnRepository repository;

    /**
     *
     * @param username es el username con el que el admin se logeara
     * @return una lista de los ususarios encontrados
     */
    @Override
    public List<Adminn> findByUsername(String username) {
        return repository.findByUsername(username);
    }

    /**
     *
     * @return devuelve un iterable que usaremos en un foreach para mostrar todos los ususarios
     */
    @Override
    public Iterable<Adminn> findAll() {
        return repository.findAll();
    }

    /**
     *
     * @param id el id del  Admin
     * @return devolvera un Optional que contendra al Admin elegido, si es que este existe
     */
    @Override
    public Optional<Adminn> findById(int id) {
        return repository.findById(id);
    }

    /**
     *
     * @param adminn un objeto de la clase Admin que sera el elegido a ser eliminado.
     */
    @Override
    public void delete(Adminn adminn) {
        repository.delete(adminn);
    }

    /**
     *
     * @param id id del admin a ser eliminado
     */
    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    /**
     *
     * @param id id del admin elegido para comprobar su existencia
     * @return retorna un boolean true(existe) or false(no existe)
     */
    @Override
    public boolean existsById(int id) {
        return repository.existsById(id);
    }

    /**
     *
     * @param adminn objeto de la clase Adminn elegida a ser guardada
     * @return retorna el objeto de la clase Adminn
     */
    @Override
    public Adminn save(Adminn adminn) {
        return repository.save(adminn);
    }

    /**
     *
     * @param admn objeto de la clase Adminn a ser guardada
     * @return retorna un iterable de Adminn. Será usada en un foreach para poder guardar todos los datos del admin
     */

    @Override
    public Iterable<Adminn> saveAll(Iterable<Adminn> admn) {
        return repository.saveAll(admn);
    }
}
