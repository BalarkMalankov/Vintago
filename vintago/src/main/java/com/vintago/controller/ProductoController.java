package com.vintago.controller;

import com.vintago.entity.Producto;
import com.vintago.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/producto")
public class ProductoController {


    IProductoService productoService;

    @Autowired
    public ProductoController(IProductoService productoService){
        this.productoService=productoService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Producto> showProducto() {

        List<Producto> list = new ArrayList<>();
        productoService.findAll().iterator().forEachRemaining(list::add);

        return list;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Producto getProductoById(@PathVariable(value="id") int id){
        return productoService.findById(id).get();
    }

    @RequestMapping(path = "/codigo/{codigoProducto}", method = RequestMethod.GET)
    public List<Producto> getProductoByCodigoProducto(@PathVariable(value = "codigoProducto") String codigoProducto) {
        return productoService.findByCodigoproducto(codigoProducto);
    }

    @RequestMapping(path = "/fechaIngreso/{fechaIngreso}", method = RequestMethod.GET)
    public List<Producto> getProductoByFechaIngreso(@PathVariable(value = "fechaIngreso") Date fechaIngreso) {
        return productoService.findByFechaingreso(fechaIngreso);
    }

    @RequestMapping(path = "/nombre/{nombre}", method = RequestMethod.GET)
    public List<Producto> getProductoByNombre(@PathVariable(value = "nombre") String nombre) {
        return productoService.findByNombreproducto(nombre);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Producto createProducto(@RequestBody Producto producto){
        return productoService.save(producto);
    }

    @RequestMapping(path="/deleteProducto",method = RequestMethod.POST)
    public void deleteProducto(@RequestBody Producto producto){
        productoService.delete(producto);
    }

    @RequestMapping(path="/delete/{id}",method = RequestMethod.DELETE)
    public void deleteProducto(@PathVariable(value = "id") int id){
        productoService.deleteById(id);
    }

    @RequestMapping(path="/exist/{id}",method = RequestMethod.POST)
    public boolean existProducto(@PathVariable(value = "id") int id){
        return productoService.existsById(id);
    }


}
