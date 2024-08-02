package com.nasa.prueba.aspirante.infraestructura.repository;

import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PruebaInterfaz  extends JpaRepository<PruebaEntity, UUID> {

}
