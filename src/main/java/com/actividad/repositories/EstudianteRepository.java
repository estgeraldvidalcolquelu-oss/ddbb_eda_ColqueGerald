package com.actividad.repositories;
import com.actividad.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}