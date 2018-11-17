package com.vintago.controller;

import com.vintago.entity.Orden;
import com.vintago.service.IOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/orden")
public class OrdenController {


    IOrdenService ordenService;

    @Autowired
    public OrdenController(IOrdenService ordenService){
        this.ordenService=ordenService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Orden> showOrden() {

        List<Orden> list = new ArrayList<>();
        ordenService.findAll().iterator().forEachRemaining(list::add);

        return list;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Orden getOrdenById(@PathVariable(value="id") int id){
        return ordenService.findById(id).get();
    }

    @RequestMapping(path = "/fechaEntrega/{fechaEnrega}", method = RequestMethod.GET)
    public List<Orden> getOrdenByFechaEnrega(@PathVariable(value = "fechaEnrega") Date fechaEnrega) {
        return ordenService.findByFechaentrega(fechaEnrega);
    }

    @RequestMapping(path = "/fechaOrden/{fechaOrden}", method = RequestMethod.GET)
    public List<Orden> getOrdenByFechaOrden(@PathVariable(value = "fechaOrden") Date fechaOrden) {
        return ordenService.findByFechaorden(fechaOrden);
    }

    @RequestMapping(path = "/fechaRecibida/{fechaRecibida}", method = RequestMethod.GET)
    public List<Orden> getOrdenByFechaRecibida(@PathVariable(value = "fechaRecibida") Date fechaRecibida) {
        return ordenService.findByFecharecibida(fechaRecibida);
    }

    @RequestMapping(path = "/numeroOrden/{numeroOrden}", method = RequestMethod.GET)
    public List<Orden> getOrdenByFechaRecibida(@PathVariable(value = "numeroOrden") int numeroOrden) {
        return ordenService.findByNumeroorden(numeroOrden);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Orden createOrden(@RequestBody Orden orden){
        return ordenService.save(orden);
    }

    @RequestMapping(path="/deleteOrden",method = RequestMethod.POST)
    public void deleteOrden(@RequestBody Orden orden){
        ordenService.delete(orden);
    }

    @RequestMapping(path="/delete/{id}",method = RequestMethod.DELETE)
    public void deleteOrden(@PathVariable(value = "id") int id){
        ordenService.deleteById(id);
    }

    @RequestMapping(path="/exist/{id}",method = RequestMethod.POST)
    public boolean existOrden(@PathVariable(value = "id") int id){
        return ordenService.existsById(id);
    }


}
