package com.info.moodtrack.moodtrack.service.habito.impl;

import com.info.moodtrack.moodtrack.dto.habito.HabitoCreateDto;
import com.info.moodtrack.moodtrack.dto.habito.HabitoDto;
import com.info.moodtrack.moodtrack.mapper.habito.HabitoMapper;
import com.info.moodtrack.moodtrack.mapper.usuario.UsuarioMapper;
import com.info.moodtrack.moodtrack.model.Habito;
import com.info.moodtrack.moodtrack.repository.habito.HabitoRepository;
import com.info.moodtrack.moodtrack.service.habito.HabitoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HabitoServiceImpl implements HabitoService {

    private final HabitoRepository habitoRepository;


    @Override
    public List<HabitoDto> obtenerTodos() {
        List<Habito> habitos = habitoRepository.findAll();

        return HabitoMapper.toDtoList(habitos);
    }

    @Override
    public Optional<HabitoDto> obtenerPorId(Long id) {
        return habitoRepository.findById(id)
                .map(HabitoMapper::toDto);
    }

    @Override
    public HabitoDto create(HabitoCreateDto createDto) {
        Habito habito = HabitoMapper.toEntity(createDto);
        Habito saved = habitoRepository.save(habito);
        return HabitoMapper.toDto(saved);
    }

}
