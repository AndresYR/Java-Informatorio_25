package com.info.moodtrack.moodtrack.service.usuario;

import com.info.moodtrack.moodtrack.dto.usuario.UsuarioCreateDto;
import com.info.moodtrack.moodtrack.dto.usuario.UsuarioDto;
import com.info.moodtrack.moodtrack.model.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UsuarioService {

    List<UsuarioDto> obtenerTodos(String nombre, String email, String colorFavorito);

    UsuarioDto crearUsuario(UsuarioCreateDto usuarioCreateDto);

    Optional<UsuarioDto> obtenerPorId(UUID id);

    UsuarioDto updateUsuario(UUID id, UsuarioCreateDto usuarioCreateDto);

    boolean eliminarUsuari0(UUID id);

}
