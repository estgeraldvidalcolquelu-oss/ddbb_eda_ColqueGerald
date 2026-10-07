package com.actividad.controllers;
import com.actividad.models.Inscripcion;
import com.actividad.repositories.InscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/v1/inscripcion")
public class InscripcionController {
    @Autowired
    private InscripcionRepository repo;
    @GetMapping
    public List<Inscripcion> getInscripciones() {
        return repo.findAll();
    }
    @PostMapping
    public Inscripcion guardar(@RequestBody Inscripcion inscripcion) {
        return repo.save(inscripcion);
    }
}