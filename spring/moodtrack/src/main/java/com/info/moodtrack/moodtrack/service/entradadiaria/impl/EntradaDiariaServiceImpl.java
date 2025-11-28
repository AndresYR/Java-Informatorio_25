package com.info.moodtrack.moodtrack.service.entradadiaria.impl;

import com.info.moodtrack.moodtrack.dto.entradadiaria.EntradaDiariaCreateDto;
import com.info.moodtrack.moodtrack.dto.entradadiaria.EntradaDiariaDto;
import com.info.moodtrack.moodtrack.mapper.entradadiaria.EntradaDiariaMapper;
import com.info.moodtrack.moodtrack.model.EntradaDiaria;
import com.info.moodtrack.moodtrack.model.Habito;
import com.info.moodtrack.moodtrack.model.Usuario;
import com.info.moodtrack.moodtrack.repository.entradadiaria.EntradaDiariaRepository;
import com.info.moodtrack.moodtrack.repository.habito.HabitoRepository;
import com.info.moodtrack.moodtrack.repository.usuario.UsuarioRepository;
import com.info.moodtrack.moodtrack.service.entradadiaria.EntradaDiariaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class EntradaDiariaServiceImpl implements EntradaDiariaService {

    private final EntradaDiariaRepository entradaDiariaRepository;
    private final UsuarioRepository usuarioRepository;
    private final HabitoRepository habitoRepository;

    @Override
    public EntradaDiariaDto create(EntradaDiariaCreateDto createDto) {
        log.info("Creando entrada diaria");
        UUID uuidUsuario = createDto.getUsuarioId();

        Optional<Usuario> usuario = usuarioRepository.findById(uuidUsuario);

        if (usuario.isEmpty()) {
            log.warn("Usuario no encontrado");
            throw  new IllegalArgumentException("Usuario no encontrado id: " + uuidUsuario);
        }

        List<Habito> habitos = List.of();
        if (createDto.getHabitosIds() != null && !createDto.getHabitosIds().isEmpty()){
            // Guardar en habitos los habitos de la bd que se envian en la request
            habitos = habitoRepository.findAllById(createDto.getHabitosIds());
            if (habitos.size() != createDto.getHabitosIds().size()) {
                log.warn("Alguno de los habitos no se ha encontrado");
            }
        }

        EntradaDiaria entradaDiaria = new EntradaDiaria();
        entradaDiaria.setUsuario(usuario.get());
        entradaDiaria.setHabitos(habitos);
        entradaDiaria.setFecha(createDto.getFecha());
        entradaDiaria.setReflexion(createDto.getReflexion());
        entradaDiaria.setEmocion(createDto.getEmocion());

        EntradaDiaria saved = entradaDiariaRepository.save(entradaDiaria);

        log.info("Entrada guardada exitosamente");
        return EntradaDiariaMapper.toDto(saved);
    }
}
