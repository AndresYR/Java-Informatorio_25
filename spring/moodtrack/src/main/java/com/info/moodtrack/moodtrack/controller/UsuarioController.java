package com.info.moodtrack.moodtrack.controller;

import com.info.moodtrack.moodtrack.dto.usuario.UsuarioCreateDto;
import com.info.moodtrack.moodtrack.dto.usuario.UsuarioDto;
import com.info.moodtrack.moodtrack.dto.usuario.UsuarioResumenDto;
import com.info.moodtrack.moodtrack.mapper.usuario.UsuarioResumenMapper;
import com.info.moodtrack.moodtrack.model.Usuario;
import com.info.moodtrack.moodtrack.service.usuario.UsuarioService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/usuarios")
@Slf4j
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<UsuarioDto> getUsuarios(
            @RequestParam(required = false) String nombre,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String colorFavorito
    ) {

        List<UsuarioDto> usuarios = usuarioService.obtenerTodos(nombre, email, colorFavorito);

        return usuarios;

    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDto> getUsuarioById(
            @PathVariable(name = "id") UUID id
            ) {
        Optional<UsuarioDto> usuario = usuarioService.obtenerDtoPorId(id);

        if (usuario.isPresent()) {
            return ResponseEntity.ok(usuario.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("/{id}/stats")
    public ResponseEntity<UsuarioResumenDto> getResumen(
            @PathVariable(name = "id") UUID id
    ) {

        UsuarioResumenDto resumenDto = usuarioService.obtenerResumen(id);

        return ResponseEntity.ok(resumenDto);

    }


    @PostMapping
    public ResponseEntity<UsuarioDto> createUsuario(
            @Valid @RequestBody UsuarioCreateDto usuarioCreateDto
    ) {

        UsuarioDto usuarioCreado = usuarioService.crearUsuario(usuarioCreateDto);

        return ResponseEntity
                .created(URI.create("/api/v1/usuarios/" + usuarioCreado.getId()))
                .body(usuarioCreado);

    }


    @PutMapping("/{id}")
    public ResponseEntity<UsuarioDto> updateUsuario(
            @PathVariable(name = "id") UUID id,
            @Valid @RequestBody UsuarioCreateDto usuarioCreateDto
    ) {
        log.info("Solicitud para actualizar usuario con id {}",id);
        UsuarioDto usuarioDto = usuarioService.updateUsuario(id, usuarioCreateDto);
        if (usuarioDto == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(usuarioDto);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deteleUsuario(@PathVariable(name = "id") UUID id) {
        boolean wasDeleted = usuarioService.eliminarUsuari0(id);
        if (!wasDeleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}
