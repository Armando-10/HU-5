package com.academic.service.services;

import com.academic.service.dtos.DivisionCreateRequestDTO;
import com.academic.service.dtos.DivisionCreateResponseDTO;
import com.academic.service.entities.Division;
import com.academic.service.repositories.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DivisionRegistrationService {

    private final DivisionRepository divisionRepository;

    @Autowired
    public DivisionRegistrationService(DivisionRepository divisionRepository) {
        this.divisionRepository = divisionRepository;
    }

    public DivisionCreateResponseDTO registrarDivision(DivisionCreateRequestDTO requestDTO) {

        // 1. Validar que la clave no exista previamente
        if (divisionRepository.existsByClave(requestDTO.getClave())) {
            throw new IllegalArgumentException(
                    "Ya existe una división registrada con la clave: " + requestDTO.getClave());
        }

        // 2. Mapear los datos a la Entidad
        Division nuevaDivision = Division.builder()
                .nombre(requestDTO.getNombre())
                .clave(requestDTO.getClave())
                .build();

        // 3. Guardar en la base de datos
        Division divisionGuardada = divisionRepository.save(nuevaDivision);

        // 4. Retornar el DTO de respuesta
        return DivisionCreateResponseDTO.builder()
                .id(divisionGuardada.getId())
                .nombre(divisionGuardada.getNombre())
                .clave(divisionGuardada.getClave())
                .activo(divisionGuardada.getActivo())
                .build();
    }
}