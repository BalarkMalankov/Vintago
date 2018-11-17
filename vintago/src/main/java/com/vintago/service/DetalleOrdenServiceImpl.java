package com.vintago.service;

import com.vintago.entity.Detalleorden;
import com.vintago.repository.DetalleordenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DetalleOrdenServiceImpl implements IDetalleOrdenService{


    @Autowired
    DetalleordenRepository repository;

    /**
     *
     * @return devuelve un iterable que usaremos en un foreach para mostrar todos
*/

    @Override
    public Iterable<Detalleorden> findAll() {
        return repository.findAll();
    }




    /**
     *
     * @param id id del detalle orden
     * @return retorna un Optional que contendra el detalle Orden elegido
     */
    @Override
    public Optional<Detalleorden> findById(int id) {
        return repository.findById(id);
    }

    /**
     *
     * @param det objeto de la clase Detalleorden elegida a ser eliminada
     */
    @Override
    public void delete(Detalleorden det) {
repository.delete(det);
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
     * @param id id elegido para ser comprobado si existe o no
     * @return retorna un booleano true(existe) or false(no existe)
     */
    @Override
    public boolean existsById(int id) {
        return repository.existsById(id);
    }

    /**
     *
     * @param det det perteneciente a la clase Detalleorden
     * @return retorna un objeto de la clase Detalleorden a ser guardada
     */
    @Override
    public Detalleorden save(Detalleorden det) {
        return repository.save(det);
    }


    /**
     *
     * @param det es el objeto pertenciente al collection Iterable que contiene a la clase DetalleOrden
     **@return retorna un Iterable que contendrá a la clase DetalleOrden que será usada en un foreach para su guardado
     */
    @Override
    public Iterable<Detalleorden> saveAll(Iterable<Detalleorden> det) {
        return repository.saveAll(det);
    }
}
