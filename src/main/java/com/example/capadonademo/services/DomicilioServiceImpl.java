package com.example.capadonademo.services;

import com.example.capadonademo.entities.Domicilio;
import com.example.capadonademo.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService {
    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}
