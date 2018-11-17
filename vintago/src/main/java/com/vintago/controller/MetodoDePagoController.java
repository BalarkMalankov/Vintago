package com.vintago.controller;

import com.vintago.entity.Metododepago;
import com.vintago.service.IMetododepagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/metodoDePago")
public class MetodoDePagoController {


    IMetododepagoService metodoDePagoService;

    @Autowired
    public MetodoDePagoController(IMetododepagoService metodoDePagoService){
        this.metodoDePagoService=metodoDePagoService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Metododepago> showMetododepago() {
        List<Metododepago> list = new ArrayList<>();
        metodoDePagoService.findAll().iterator().forEachRemaining(list::add);

        return list;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Metododepago getMetododepagoById(@PathVariable(value="id") int id){
        return metodoDePagoService.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Metododepago createMetododepago(@RequestBody Metododepago metodoDePago){
        return metodoDePagoService.save(metodoDePago);
    }

    @RequestMapping(path="/deleteMetododepago",method = RequestMethod.POST)
    public void deleteMetododepago(@RequestBody Metododepago metodoDePago){
        metodoDePagoService.delete(metodoDePago);
    }

    @RequestMapping(path="delete/{id}",method = RequestMethod.DELETE)
    public void deleteMetododepago(@PathVariable(value = "id") int id){
        metodoDePagoService.deleteById(id);
    }

    @RequestMapping(path="/exist/{id}",method = RequestMethod.POST)
    public boolean existMetododepago(@PathVariable(value = "id") int id){
        return metodoDePagoService.existsById(id);
    }

}
