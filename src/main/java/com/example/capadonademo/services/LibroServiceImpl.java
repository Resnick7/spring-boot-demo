package com.example.capadonademo.services;

import com.example.capadonademo.entities.Libro;
import com.example.capadonademo.repositories.BaseRepository;
import com.example.capadonademo.repositories.LibroRepository;
import com.example.capadonademo.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}
