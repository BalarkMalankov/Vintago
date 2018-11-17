package com.vintago.controller;

import com.vintago.entity.Categoria;
import com.vintago.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/api/categoria")
public class CategoriaController {


    private ICategoriaService categoriaService;

    @Autowired
    public CategoriaController(ICategoriaService categoriaService){
        this.categoriaService=categoriaService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> showCategoria() {

        List<Categoria> list = new ArrayList<>();
        categoriaService.findAll().iterator().forEachRemaining(list::add);

        return list;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Categoria getCategoriaById(@PathVariable(value="id") int id){
        return categoriaService.findById(id).get();
    }

    @RequestMapping(path = "/buscarNombre/{nombre}", method = RequestMethod.GET)
    public List<Categoria> getCategoriaByNombre(@PathVariable(value = "nombre") String nombre) {
        return categoriaService.findByNombrecategoria(nombre);
    }

    @CrossOrigin("http://localhost:3000")
    @RequestMapping(method = RequestMethod.POST)
    public Categoria createCategoria(@RequestBody Categoria categoria){
        return categoriaService.save(categoria);
    }

    @RequestMapping(path="/deleteCategoria",method = RequestMethod.POST)
    public void deleteCategoria(@RequestBody Categoria categoria){
        categoriaService.delete(categoria);
    }

    @RequestMapping(path="/delete/{id}",method = RequestMethod.DELETE)
    public void deleteCategoria(@PathVariable(value = "id") int id){
        categoriaService.deleteById(id);
    }

}
