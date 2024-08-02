package com.nasa.prueba.aspirante.dominio.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "items")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PruebaEntity {

    @Id
    @GeneratedValue
    private UUID id;
    private String href;
    private String center;
    private String title;
    private String nasa_id;
    @Column(name = "datetime", updatable = false)
    private LocalDateTime datetime;

    @PrePersist
    protected void onCreate() {
        datetime = LocalDateTime.now();
    }


}
