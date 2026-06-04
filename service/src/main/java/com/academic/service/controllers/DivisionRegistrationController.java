package com.academic.service.controllers;

import com.academic.service.dtos.DivisionCreateRequestDTO;
import com.academic.service.dtos.DivisionCreateResponseDTO;
import com.academic.service.services.DivisionRegistrationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/divisiones/registro")
public class DivisionRegistrationController {

    private final DivisionRegistrationService registrationService;

    @Autowired
    public DivisionRegistrationController(DivisionRegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping
    public ResponseEntity<DivisionCreateResponseDTO> registrarNuevaDivision(
            @Valid @RequestBody DivisionCreateRequestDTO requestDTO) {
        
        DivisionCreateResponseDTO response = registrationService.registrarDivision(requestDTO);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}