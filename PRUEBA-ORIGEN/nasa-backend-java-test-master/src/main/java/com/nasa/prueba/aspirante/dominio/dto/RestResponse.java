package com.nasa.prueba.aspirante.dominio.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestResponse {
    private String code;
    private String status;
    private PruebaEntity data;



    @Override
    public String toString() {
        return "RestResponse{" +
                "code='" + code + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
