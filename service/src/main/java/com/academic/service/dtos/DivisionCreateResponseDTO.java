package com.academic.service.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DivisionCreateResponseDTO {
    private Long id;
    private String nombre;
    private String clave;
    private Boolean activo;
}