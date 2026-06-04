package com.academic.service.controllers;

import com.academic.service.dtos.ProgramaListaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/programas")
public class ProgramaController {

    @GetMapping
    public List<ProgramaListaDTO> simularVistaHU4() {
        ProgramaListaDTO programa1 = new ProgramaListaDTO(1L, "Desarrollo de Software Multiplataforma", "Intensiva",
                "Tecnologías de la Información");
        ProgramaListaDTO programa2 = new ProgramaListaDTO(2L, "Entornos Virtuales y Negocios Digitales", "Mixta",
                "Tecnologías de la Información");

        return Arrays.asList(programa1, programa2);
    }
}