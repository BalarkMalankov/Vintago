package com.vintago.service;

import com.vintago.entity.Orden;
import com.vintago.repository.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrdenServiceImpl implements IOrdenService {

    @Autowired
    OrdenRepository repository;

    /**
     *
     * @param fechaOrden parametro de tipo Date
     * @return retorna una lista de la clase Orden segun la fechaOrden a la que pertenece
     */
    @Override
    public List<Orden> findByFechaorden(Date fechaOrden) {

        return repository.findByFechaorden(fechaOrden);
    }

    /**
     *
     * @param fechaEntrega parametro de tipo Date
     * @return retorna una lista de la clase Orden segun la fechaEntrega
     */
    @Override
    public List<Orden> findByFechaentrega(Date fechaEntrega) {

        return repository.findByFechaentrega(fechaEntrega);
    }

    /**
     *
     * @param fechaRecibida parametro de tipo Date
     * @return retorna una lista de la clase Orden segun la fechaRecibida
     */
    @Override
    public  List<Orden> findByFecharecibida(Date fechaRecibida){
        return repository.findByFecharecibida(fechaRecibida);
    }

    /**
     *
     * @param numerOrden parametro de tipo int
     * @return retorna una lista de la clase Orden segun el numero de Orden al que pertenezca
     */
    @Override
    public  List<Orden> findByNumeroorden(int numerOrden){

        return repository.findByNumeroorden( numerOrden);
    }

    /**
     *
     * @return Retorna un iterable que usaremos en un foreach para mostrar todas las ordenes
     */
    @Override
    public Iterable<Orden> findAll() {
        return repository.findAll();
    }

    /**
     *
     * @param id parametro de tipo int
     * @return retornara un Optional que contendra las Ordenes que pertenezcan a un determinado ID
     */
    @Override
    public Optional<Orden> findById(int id) {
        return repository.findById(id);
    }

    /**
     *
     * @param adminn un objeto de la clase Orden, elegido para ser eliminado
     */

    @Override
    public void delete(Orden adminn) {
        repository.delete(adminn);
    }

    /**
     *
     * @param id id de la Orden a ser eliminada
     */
    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    /**
     *
     * @param id id de la Orden
     * @return  retorna un boolean true(existe) or false(no existe)
     */
    @Override
    public boolean existsById(int id) {
        return repository.existsById(id);
    }

    /**
     *
     * @param adminn objeto de la clase Orden elegido a ser guardado
     * @return retorna el objeto de la clase Orden
     */
    @Override
    public Orden save(Orden adminn) {
        return repository.save(adminn);
    }

    /**
     *
     * @param admn objeto de la clase Orden a ser guardada
     * @return retorna un iterable de Orden. sera usada en un foreach para guardar todos los datos de la Orden
     */
    @Override
    public Iterable<Orden> saveAll(Iterable<Orden> admn) {
        return repository.saveAll(admn);
    }

}

