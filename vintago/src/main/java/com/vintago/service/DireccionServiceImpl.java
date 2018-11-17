package com.vintago.service;

import com.vintago.entity.Direccion;
import com.vintago.repository.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DireccionServiceImpl implements IDireccionService {

    @Autowired
    DireccionRepository repository;

    /**
     *
     * @param distrito distrito es un string, que representa el nombre del distrito
     * @return una lista de los distrito encontrados
     */
    @Override
    public List<Direccion> findByDistrito(String distrito){
        return repository.findByDistrito(distrito);
    }

    /**
     *
     * @param calle es el username con el que el admin se logeara
     * @return una lista de los ususarios encontrados
     */
    @Override
    public  List<Direccion> findByCalle(String calle){
        return repository.findByCalle(calle);
    }

    /**
     *
     * @return devuelve un iterable que usaremos en un foreach para mostrar todos las direcciones
     */
    @Override
    public Iterable<Direccion> findAll() {
        return repository.findAll();
    }

    /**
     *
     * @param id el id de la direccion
     * @return devolvera un Optional que contendra la direccion elegida, si es que este existe
     */
    @Override
    public Optional<Direccion> findById(int id) {
        return repository.findById(id);    }

    /**
     *
     * @param dir un objeto de la clase Direccion que sera el elegido a ser eliminado.
     */
    @Override
    public void delete(Direccion dir) {
repository.delete(dir);
    }

    /**
     *
     * @param id  id de la direccion a ser eliminado
     */
    @Override
    public void deleteById(int id) {
repository.deleteById(id);
    }

    /**
     *
     * @param id id de la direccion elegida para comprobar su existencia
     ** @return retorna un boolean true(existe) or false(no existe)
     */
    @Override
    public boolean existsById(int id) {
        return repository.existsById(id);
    }

    /**
     *
     * @param dir de la clase Direccion elegida a ser guardada
     ** @return retorna el objeto de la clase Direccion
     */
    @Override
    public Direccion save(Direccion dir) {
        return repository.save(dir);
    }

    /**
     *
     * @param dir es el objeto pertenciente al collection Iterable que contiene a la clase Direccion
     **@return retorna un Iterable que contendrá a la clase Direccion que será usada en un foreach para su guardado
     */
    @Override
    public Iterable<Direccion> saveAll(Iterable<Direccion> dir) {
        return repository.saveAll(dir);
    }


}


