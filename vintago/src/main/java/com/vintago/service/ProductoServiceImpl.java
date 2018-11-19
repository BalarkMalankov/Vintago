package com.vintago.service;

import com.vintago.entity.Producto;
import com.vintago.entity.SubCategoria;
import com.vintago.repository.ProductoRepository;
import com.vintago.repository.SubCategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    ProductoRepository repository;

    @Autowired
    SubCategoriaRepository subCategoriaRepository;

    /**
     *
     * @param codigoProducto parametro de tipo String
     * @return retorna una lista de la clase Producto que pertenezca a un codigoProducto
     */

    @Override
    public List<Producto> findByCodigoproducto(String codigoProducto) {
        return repository.findByCodigoproducto(codigoProducto);
    }

    /**
     *
     * @param stock parametro de tipo int
     * @return retorna una lista de la clase Producto que contenga el stock ingresado
     */
    @Override
    public List<Producto> findByStock(int stock) {
        return repository.findByStock(stock);
    }

    /**
     *
     * @param fechaIngreso parametro de tipo date
     * @return retorna una lsta de la clase Producto que pertenezcan a una fechaIngreso
     */
    @Override
    public List<Producto> findByFechaingreso(Date fechaIngreso) {
        return repository.findByFechaingreso(fechaIngreso);
    }

    /**
     *
     * @param nombre parametro de tipo String
     * @return retorna una lista de la clase Producto que contenga el nombre recibido
     */
    @Override
    public List<Producto> findByNombreproducto(String nombre) {
        return repository.findByNombreproducto(nombre);
    }

    /**
     *
     * @return retorna un iterable que usaremos en un foreach para mostrar
     * todos los Productos
     */
    @Override
    public Iterable<Producto> findAll() {

        return repository.findAll();
    }

    /**
     *
     * @param id parametro de tipo id
     * @return retorna un Optional que se utilizara en un foreach para mostrar los Productos
     */
    @Override
    public Optional<Producto> findById(int id)
    {

        return repository.findById(id);
    }

    /**
     *
     * @param adminn es un parametro de la clase Producto a ser eliminado
     */
    @Override
    public void delete(Producto adminn) {

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
     * @return retorna un boolean true(existe) or false(no existe)
     */
    @Override
    public boolean existsById(int id)
    {

        return repository.existsById(id);
    }

    /**
     *
     * @param producto objeto de la clase Producto elegido a ser guardado
     * @return retorna el objeto de la clase Producto
     */

    @Override
    public Producto save(Producto producto) {

       // return repository.save(producto);

        Optional<SubCategoria> subCategoria=subCategoriaRepository.findById(producto.getSubCategoria().getIdsubcategoria());
        if(subCategoria.isPresent()){
            producto.setSubCategoria(subCategoria.get());
            return repository.save(producto);
        }
        return null;

    }

    /**
     *
     * @param admn objeto de la clase Producto
     * @return retorna  un Iterable, que sera utilizada en un foreach
     * podra poder guardar todos los datos del Producto
     */
    @Override
    public Iterable<Producto> saveAll(Iterable<Producto> admn) {

        return repository.saveAll(admn);
    }
}
