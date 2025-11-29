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
import java.util.Optional;

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

    @GetMapping("/{id}")
    public ResponseEntity<HabitoDto> getHabitoById(@PathVariable(name = "id") Long id) {
        Optional<HabitoDto> habito = habitoService.obtenerPorId(id);

        if (habito.isPresent()) {
            return ResponseEntity.ok(habito.get());
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<HabitoDto> crear(@Valid @RequestBody HabitoCreateDto createDto) {

        HabitoDto habitoCreado = habitoService.create(createDto);
        log.info("Habito creado exitosamente");
        return ResponseEntity.ok(habitoCreado);

    }

}
