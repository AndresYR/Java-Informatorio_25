package com.info.moodtrack.moodtrack.controller;

import com.info.moodtrack.moodtrack.dto.habito.HabitoCreateDto;
import com.info.moodtrack.moodtrack.dto.habito.HabitoDto;
import com.info.moodtrack.moodtrack.service.habito.HabitoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/habitos")
@RequiredArgsConstructor
@Slf4j
public class HabitoController {

    private final HabitoService habitoService;

    @GetMapping
    public List<HabitoDto> getHabitos() {

        List<HabitoDto> habitos = habitoService.obtenerTodos();

        return habitos;
    }

    @PostMapping
    public ResponseEntity<HabitoDto> crear(@Valid @RequestBody HabitoCreateDto createDto) {

        HabitoDto habitoCreado = habitoService.create(createDto);
        log.info("Habito creado exitosamente");
        return ResponseEntity.ok(habitoCreado);

    }

}
