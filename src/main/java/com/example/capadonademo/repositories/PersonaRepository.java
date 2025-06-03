package com.example.capadonademo.repositories;

import com.example.capadonademo.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    // Anotación metodo de query
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

//    boolean existByDni(int dni);

    // Anotación JPQL parametros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%'")
    List<Persona> search(String filtro);

//    // Anotacion JPQL parametros nombrados
//    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%'")
//    List<Persona> search1(@Param("filtro") String filtro);
    
    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE '%?1%' OR perosna.apellido LIKE '%?1%'",
            nativeQuery = true
    )
    List<Persona> searchNativo(String filtro);
}
