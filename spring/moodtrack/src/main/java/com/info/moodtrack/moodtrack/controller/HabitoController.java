package com.info.moodtrack.moodtrack.controller;

import com.info.moodtrack.moodtrack.dto.habito.HabitoDto;
import com.info.moodtrack.moodtrack.service.habito.HabitoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
