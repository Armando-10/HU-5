package com.academic.service.dtos;

import java.util.Objects;

public class ProgramaListaDTO {
    private Long id;
    private String nombrePrograma;
    private String modalidad;
    private String nombreDivisionPadre;

    public ProgramaListaDTO() {
    }

    public ProgramaListaDTO(Long id, String nombrePrograma, String modalidad, String nombreDivisionPadre) {
        this.id = id;
        this.nombrePrograma = nombrePrograma;
        this.modalidad = modalidad;
        this.nombreDivisionPadre = nombreDivisionPadre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getNombreDivisionPadre() {
        return nombreDivisionPadre;
    }

    public void setNombreDivisionPadre(String nombreDivisionPadre) {
        this.nombreDivisionPadre = nombreDivisionPadre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof ProgramaListaDTO))
            return false;
        ProgramaListaDTO that = (ProgramaListaDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(nombrePrograma, that.nombrePrograma)
                && Objects.equals(modalidad, that.modalidad)
                && Objects.equals(nombreDivisionPadre, that.nombreDivisionPadre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombrePrograma, modalidad, nombreDivisionPadre);
    }

    @Override
    public String toString() {
        return "ProgramaListaDTO{" + "id=" + id + ", nombrePrograma='" + nombrePrograma + '\'' + ", modalidad='"
                + modalidad + '\'' + ", nombreDivisionPadre='" + nombreDivisionPadre + '\'' + '}';
    }
}