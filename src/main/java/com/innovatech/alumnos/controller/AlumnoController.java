package com.innovatech.alumnos.controller;
import com.innovatech.alumnos.model.Alumno;
import com.innovatech.alumnos.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
    @Autowired
    private AlumnoRepository repository;

    @GetMapping
    public List<Alumno> listarTodos() {
        return repository.findAll();
    }
}
