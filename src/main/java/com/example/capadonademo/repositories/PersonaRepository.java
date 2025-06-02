package com.example.capadonademo.repositories;

import com.example.capadonademo.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
