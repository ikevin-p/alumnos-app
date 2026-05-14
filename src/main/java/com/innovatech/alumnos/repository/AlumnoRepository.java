package com.innovatech.alumnos.repository;
import com.innovatech.alumnos.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
