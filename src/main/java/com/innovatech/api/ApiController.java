package com.innovatech.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ApiController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
            "status", "UP",
            "app", "Innovatech Chile API",
            "version", "1.0.0"
        );
    }

    @GetMapping("/info")
    public Map<String, String> info() {
        return Map.of(
            "empresa", "Innovatech Chile",
            "descripcion", "API Backend Spring Boot",
            "ambiente", "produccion"
        );
    }
}
