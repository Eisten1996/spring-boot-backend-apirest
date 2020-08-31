package com.dipper.springboot.backend.apirest.app.models.dao;

import com.dipper.springboot.backend.apirest.app.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
