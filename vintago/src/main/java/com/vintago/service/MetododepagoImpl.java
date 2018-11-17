package com.vintago.service;

import com.vintago.entity.Metododepago;
import com.vintago.repository.MetododepagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MetododepagoImpl implements  IMetododepagoService{

    @Autowired
    MetododepagoRepository repository;

    /**
     *
      * @return retorna un iterable que usaremos en un foreach
     *  para mostrar todos los metodos de pago
     */
    @Override
    public Iterable<Metododepago> findAll() {

        return repository.findAll();
    }

    /**
     *
     * @param id es un parametro de tipo int, que representa la clave primaria del Metodo de Pago
     * @return retorna un optional que mostrara todos los datos del Metodo de pago asociados a un id
     */
    @Override
    public Optional<Metododepago> findById(int id) {

        return repository.findById(id);
    }

    /**
     *
     * @param adminn es un objeto de la clase Metododepago a ser eliminada
     */
    @Override
    public void delete(Metododepago adminn) {
        repository.delete(adminn);
    }

    /**
     *
     * @param id es el parametro elegido a ser eliminado
     */
    @Override
    public void deleteById(int id) {
          repository.deleteById(id);
    }

    /**
     *
     * @param id elegido para comprobar su existencia
     * @return  retorna un boolean true(existe) or false(no existe)
     */
    @Override
    public boolean existsById(int id) {

        return repository.existsById(id);
    }

    /**
     *
     * @param adminn objeto de la clase Metododeapgo elegido a ser guardado
     * @return retorna el objeto de la clase Metododepago
     */
    @Override
    public Metododepago save(Metododepago adminn) {

        return repository.save(adminn);
    }

    /**
     *
     * @param admn objeto de la clase Metododeapgo a ser guardada
     * @return retorna un Iterable, que sera utilizada en un foreach para poder guardar todos los datos del Metododepago
     */
    @Override
    public Iterable<Metododepago> saveAll(Iterable<Metododepago> admn) {

        return repository.saveAll(admn);
    }

}
