package com.vintago.controller;

import com.vintago.entity.Direccion;
import com.vintago.service.IDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/direccion")
public class DireccionController {


    IDireccionService direccionService;

    @Autowired
    public DireccionController(IDireccionService direccionService){
        this.direccionService=direccionService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Direccion> showDireccion() {

        List<Direccion> list = new ArrayList<>();
        direccionService.findAll().iterator().forEachRemaining(list::add);

        return list;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Direccion getDireccionById(@PathVariable(value="id") int id){
        return direccionService.findById(id).get();
    }

    @RequestMapping(path = "/calle/{calle}", method = RequestMethod.GET)
    public List<Direccion> getDireccionByCalle(@PathVariable(value = "calle") String calle) {
        return direccionService.findByCalle(calle);
    }

    @RequestMapping(path = "/distrito/{distrito}", method = RequestMethod.GET)
    public List<Direccion> getDireccionByDistrito(@PathVariable(value = "distrito") String distrito) {
        return direccionService.findByCalle(distrito);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Direccion createDireccion(@RequestBody Direccion direccion){
        return direccionService.save(direccion);
    }

    @RequestMapping(path="/deleteDireccion",method = RequestMethod.POST)
    public void deleteDireccion(@RequestBody Direccion direccion){
        direccionService.delete(direccion);
    }

    @RequestMapping(path="/delete/{id}",method = RequestMethod.DELETE)
    public void deleteDireccion(@PathVariable(value = "id") int id){
        direccionService.deleteById(id);
    }

    @RequestMapping(path="/exist/{id}",method = RequestMethod.POST)
    public boolean existDireccion(@PathVariable(value = "id") int id){
        return direccionService.existsById(id);
    }

}
