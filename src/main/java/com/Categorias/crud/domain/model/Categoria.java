package com.Categorias.crud.model;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Getter
@Setter
@Entity
public class Categoria {

    @Id

    private Long id;

    @NotBlank
    @Size(max=50)
    private String nombre;

    @NotBlank
    @Size(max=90)
    private String descripcion;
}
