package com.vintago.controller;

import com.vintago.entity.SubCategoria;
import com.vintago.service.ISubCategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/subCategoria")
public class SubCategoriaController {


    ISubCategoriaService subCategoriaService;

    @Autowired
    public SubCategoriaController(ISubCategoriaService subCategoriaService){
        this.subCategoriaService=subCategoriaService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<SubCategoria> showSubCategoria() {

        List<SubCategoria> list = new ArrayList<>();
        subCategoriaService.findAll().iterator().forEachRemaining(list::add);

        return list;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public SubCategoria getSubCategoriaById(@PathVariable(value="id") int id){
        return subCategoriaService.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.POST)
    public SubCategoria createSubCategoria(@RequestBody SubCategoria subCategoria){
        return subCategoriaService.save(subCategoria);
    }

    @RequestMapping(path="/deleteSubCategoria",method = RequestMethod.POST)
    public void deleteSubCategoria(@RequestBody SubCategoria subCategoria){
        subCategoriaService.delete(subCategoria);
    }

    @RequestMapping(path="/delete/{id}",method = RequestMethod.DELETE)
    public void deleteSubCategoria(@PathVariable(value = "id") int id){
        subCategoriaService.deleteById(id);
    }

    @RequestMapping(path="/exist/{id}",method = RequestMethod.POST)
    public boolean existSubCategoria(@PathVariable(value = "id") int id){
        return subCategoriaService.existsById(id);
    }

}