package com.actividad.controllers;
import com.actividad.models.Estudiante;
import com.actividad.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/v1/estudiante")
public class EstudianteController {
    @Autowired
    private EstudianteRepository repo;
    @GetMapping
    public List<Estudiante> getEstudiantes() {
        return repo.findAll();
    }
    @PostMapping
    public Estudiante guardar(@RequestBody Estudiante estudiante) {
        return repo.save(estudiante);
    }
}