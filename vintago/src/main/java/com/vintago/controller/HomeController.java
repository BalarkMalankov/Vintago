package com.vintago.controller;

import com.vintago.entity.Adminn;
import com.vintago.service.IAdminnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/home")
public class HomeController {

    IAdminnService adminnService;

    @Autowired
    public HomeController(IAdminnService adminnService){
        this.adminnService=adminnService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Adminn> hello() {

        List<Adminn> list = new ArrayList<>();

        adminnService.findAll().iterator().forEachRemaining(list::add);

        return list;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Adminn getAdminnById(@PathVariable(value = "id") int id){
        return adminnService.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Adminn createAdminn(@RequestBody Adminn adm){

        return adminnService.save(adm);
    }

    @RequestMapping(path = "/username/{username}", method = RequestMethod.GET)
    public List<Adminn> getAdminnById(@PathVariable(value = "username") String username){
        return adminnService.findByUsername(username);
    }
}
