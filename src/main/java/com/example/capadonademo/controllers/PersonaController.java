package com.example.capadonademo.controllers;

import com.example.capadonademo.entities.Persona;
import com.example.capadonademo.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {
}
