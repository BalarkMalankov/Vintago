package com.vintago.repository;

import com.vintago.entity.Orden;
import com.vintago.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.Date;
import java.util.List;

public interface ProductoRepository extends CrudRepository<Producto, Integer>, Repository<Producto, Integer> {
    List<Producto> findByCodigoproducto(String codigoProducto);
    List<Producto> findByStock(int stock);
    List<Producto> findByFechaingreso(Date fechaIngreso);
    List<Producto> findByNombreproducto(String nombre);
}
