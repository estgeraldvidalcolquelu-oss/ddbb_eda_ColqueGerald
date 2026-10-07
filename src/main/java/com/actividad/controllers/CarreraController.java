package com.actividad.controllers;
import com.actividad.models.Carrera;
import com.actividad.repositories.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/v1/carrera")
public class CarreraController {
    @Autowired
    private CarreraRepository repo;
    @GetMapping
    public List<Carrera> getCarreras() {
        return repo.findAll();
    }
    @PostMapping
    public Carrera guardar(@RequestBody Carrera carrera) {
        return repo.save(carrera);
    }
}