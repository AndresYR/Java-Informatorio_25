package com.info.moodtrack.moodtrack.service.entradadiaria;

import com.info.moodtrack.moodtrack.dto.entradadiaria.EntradaDiariaCreateDto;
import com.info.moodtrack.moodtrack.dto.entradadiaria.EntradaDiariaDto;

public interface EntradaDiariaService {

    EntradaDiariaDto create(EntradaDiariaCreateDto createDto);

}
