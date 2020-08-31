package com.dipper.springboot.backend.apirest.app.models.services;

import com.dipper.springboot.backend.apirest.app.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();
}
