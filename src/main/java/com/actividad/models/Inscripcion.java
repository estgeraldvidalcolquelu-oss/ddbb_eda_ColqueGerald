package com.actividad.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
@Entity
@Table(name = "inscripciones")
public class Inscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long estudianteId;
    private Long carreraId;
    private LocalDate fechaInscripcion;
    public Inscripcion() {
    }
    public Inscripcion(Long id, Long estudianteId, Long carreraId, LocalDate fechaInscripcion) {
        this.id = id;
        this.estudianteId = estudianteId;
        this.carreraId = carreraId;
        this.fechaInscripcion = fechaInscripcion;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getEstudianteId() {
        return estudianteId;
    }
    public void setEstudianteId(Long estudianteId) {
        this.estudianteId = estudianteId;
    }
    public Long getCarreraId() {
        return carreraId;
    }
    public void setCarreraId(Long carreraId) {
        this.carreraId = carreraId;
    }
    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }
    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
}