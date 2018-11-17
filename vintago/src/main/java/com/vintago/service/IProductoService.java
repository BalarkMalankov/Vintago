package com.vintago.service;


import com.vintago.entity.Producto;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IProductoService {

    List<Producto> findByCodigoproducto(String codigoProducto);
    List<Producto> findByStock(int stock);
    List<Producto> findByFechaingreso(Date fechaIngreso);
    List<Producto> findByNombreproducto(String nombre);


    Iterable<Producto> findAll();
    Optional<Producto> findById(int id);
    void delete(Producto adminn);
    void deleteById(int id);
    boolean existsById(int id);
    Producto save(Producto adminn);
    Iterable<Producto> saveAll(Iterable<Producto> admn);
}
