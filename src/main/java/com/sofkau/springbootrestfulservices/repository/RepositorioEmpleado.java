package com.sofkau.springbootrestfulservices.repository;

import com.sofkau.springbootrestfulservices.models.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioEmpleado extends MongoRepository<Empleado, String> {
}