package com.vintago.controller;

import com.vintago.entity.Detalleorden;
import com.vintago.service.IDetalleOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/detalleOrden")
public class DetalleOrdenController {

    private IDetalleOrdenService detalleOrdenService;

    @Autowired
    public DetalleOrdenController(IDetalleOrdenService detalleOrdenService){
        this.detalleOrdenService=detalleOrdenService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Detalleorden> showDetalleOrden() {

        List<Detalleorden> list = new ArrayList<>();
        detalleOrdenService.findAll().iterator().forEachRemaining(list::add);

        return list;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Detalleorden getDetalleOrdenById(@PathVariable(value="id") int id){
        return detalleOrdenService.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Detalleorden createDetalleOrden(@RequestBody Detalleorden detalleOrden){
        return detalleOrdenService.save(detalleOrden);
    }

    @RequestMapping(path="/deleteDetalleOrden",method = RequestMethod.POST)
    public void deleteDetalleOrden(@RequestBody Detalleorden detalleOrden){
        detalleOrdenService.delete(detalleOrden);
    }

    @RequestMapping(path="/delete/{id}",method = RequestMethod.DELETE)
    public void deleteDetalleOrden(@PathVariable(value = "id") int id){
        detalleOrdenService.deleteById(id);
    }

    @RequestMapping(path="/exist/{id}",method = RequestMethod.POST)
    public boolean existDetalleOrden(@PathVariable(value = "id") int id){
        return detalleOrdenService.existsById(id);
    }


}