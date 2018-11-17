package com.vintago.controller;

import com.vintago.entity.Cliente;
import com.vintago.service.IClienteService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/cliente")
@Api(description = "Esta es la nueva descripción del servicio...")
public class ClienteController {


    IClienteService clienteService;

    @Autowired
    public ClienteController(IClienteService clienteService){
        this.clienteService=clienteService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Cliente> showCliente() {

        List<Cliente> list = new ArrayList<>();
        clienteService.findAll().iterator().forEachRemaining(list::add);

        return list;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Cliente getClienteById(@PathVariable(value="id") int id){
        return clienteService.findById(id).get();
    }

    @RequestMapping(path = "/nombre/{nombre}", method = RequestMethod.GET)
    public List<Cliente> getClienteByNombre(@PathVariable(value = "nombre") String nombre) {
        return clienteService.findByNombre(nombre);
    }

    @RequestMapping(path = "/apellido/{apellido}", method = RequestMethod.GET)
    public List<Cliente> getClienteByApellido(@PathVariable(value = "apellido") String apellido) {
        return clienteService.findByApellido(apellido);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Cliente createCliente(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @RequestMapping(path="/deleteCliente",method = RequestMethod.POST)
    public void deleteCliente(@RequestBody Cliente cliente){
        clienteService.delete(cliente);
    }

    @RequestMapping(path="/delete/{id}",method = RequestMethod.DELETE)
    public void deleteCliente(@PathVariable(value = "id") int id){
        clienteService.deleteById(id);
    }

    @RequestMapping(path="/exist/{id}",method = RequestMethod.POST)
    public boolean existCliente(@PathVariable(value = "id") int id){
        return clienteService.existsById(id);
    }


}
