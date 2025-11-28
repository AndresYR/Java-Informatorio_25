package com.info.moodtrack.moodtrack.mapper.entradadiaria;

import com.info.moodtrack.moodtrack.dto.entradadiaria.EntradaDiariaDto;
import com.info.moodtrack.moodtrack.mapper.usuario.UsuarioMapper;
import com.info.moodtrack.moodtrack.model.EntradaDiaria;
import com.info.moodtrack.moodtrack.model.Habito;

public final class EntradaDiariaMapper {

    public EntradaDiariaMapper() {}

    public static EntradaDiariaDto toDto(EntradaDiaria entradaDiaria) {

        if (entradaDiaria == null) return null;

        EntradaDiariaDto dto = new EntradaDiariaDto();
        dto.setId(entradaDiaria.getId());
        dto.setFecha(entradaDiaria.getFecha());
        dto.setEmocion(entradaDiaria.getEmocion());
        dto.setReflexion(entradaDiaria.getReflexion());
        dto.setUsuarioDto(UsuarioMapper.toDto(entradaDiaria.getUsuario()));

        if (entradaDiaria.getHabitos() != null && !entradaDiaria.getHabitos().isEmpty()) {
            dto.setHabitosDescripciones(
                    entradaDiaria.getHabitos().stream()
                            .map(Habito::getDescripcion)
                            .toList()
            );
        }

        return dto;

    }
}
