package com.info.moodtrack.moodtrack.dto.habito;

import com.info.moodtrack.moodtrack.model.NivelDeImportanciaEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HabitoCreateDto {

    @NotBlank(message = "La descripcion no puede ser vacia")
    @Size(max = 250, message = "La descripcion no puede superar los 250 caracteres")
    private String descripcion;

    @NotNull(message = "El nivel de importancia no puede ser nulo")
    private NivelDeImportanciaEnum nivelDeImportanciaEnum;

}
