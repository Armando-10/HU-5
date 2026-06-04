package com.academic.service.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DivisionCreateRequestDTO {

    @NotBlank(message = "El nombre de la división es obligatorio")
    private String nombre;

    @NotBlank(message = "La clave de la división es obligatoria")
    private String clave;
}