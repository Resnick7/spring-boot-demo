package com.example.capadonademo.services;

import com.example.capadonademo.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long>{
    List<Persona> search(String filtro) throws Exception;
}
