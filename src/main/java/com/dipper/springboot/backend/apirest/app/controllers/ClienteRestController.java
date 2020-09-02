package com.dipper.springboot.backend.apirest.app.controllers;

import com.dipper.springboot.backend.apirest.app.models.entity.Cliente;
import com.dipper.springboot.backend.apirest.app.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> showAllCliente() {
        return clienteService.findAll();
    }

    @GetMapping("/clientes/{id}")
    public Cliente showCliente(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }
}
