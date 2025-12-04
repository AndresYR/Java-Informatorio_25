package com.info.moodtrack.moodtrack.dto.usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResumenDto {

    private String nombre;
    private String email;
    private String colorFavorito;
    private int cantidadEntradas;
    private LocalDate fechaUltimaEntrada;

}
