package com.nasa.prueba.aspirante.infraestructura.restcontroller;

import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;
import com.nasa.prueba.aspirante.infraestructura.clientrest.PruebaClienteRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PruebaRestController {


    @Autowired
    private PruebaClienteRest pruebaClienteRest;

public PruebaRestController(PruebaClienteRest pruebaClienteRest){
    pruebaClienteRest = pruebaClienteRest;
}

    @GetMapping("/NasaAll")
    public List<PruebaEntity> findAll() {
        return pruebaClienteRest.findNasaAll();
    }
}
