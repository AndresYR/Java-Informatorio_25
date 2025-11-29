package com.info.moodtrack.moodtrack.service.habito;

import com.info.moodtrack.moodtrack.dto.habito.HabitoCreateDto;
import com.info.moodtrack.moodtrack.dto.habito.HabitoDto;

import java.util.List;
import java.util.Optional;

public interface HabitoService {

    List<HabitoDto> obtenerTodos();

    HabitoDto create(HabitoCreateDto createDto);

    Optional<HabitoDto> obtenerPorId(Long id);

}
