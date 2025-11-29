package com.info.moodtrack.moodtrack.mapper.habito;

import com.info.moodtrack.moodtrack.dto.habito.HabitoDto;
import com.info.moodtrack.moodtrack.model.Habito;

import java.util.List;

public class HabitoMapper {

    public HabitoMapper() {}

    public static HabitoDto toDto(Habito habito) {

        if (habito == null) return null;

        HabitoDto dto = new HabitoDto();
        dto.setId(habito.getId());
        dto.setDescripcion(habito.getDescripcion());

        return dto;

    }

    public static List<HabitoDto> toDtoList(List<Habito> habitos) {

        return habitos.stream()
                .map(HabitoMapper::toDto)
                .toList();
    }

}
