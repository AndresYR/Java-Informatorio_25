package com.info.moodtrack.moodtrack.mapper.usuario;

import com.info.moodtrack.moodtrack.dto.usuario.UsuarioResumenDto;
import com.info.moodtrack.moodtrack.model.Usuario;

public final class UsuarioResumenMapper {

    public UsuarioResumenMapper() {}

    public static UsuarioResumenDto resumenDto(Usuario usuario) {

        UsuarioResumenDto resumenDto = new UsuarioResumenDto();

        resumenDto.setNombre( usuario.getNombre() );
        resumenDto.setEmail( usuario.getEmail() );
        resumenDto.setColorFavorito( usuario.getPerfil().getColorFavorito() );
        resumenDto.setCantidadEntradas( usuario.getEntradasDiarias().size() );

        if (resumenDto.getCantidadEntradas() != 0) {
            resumenDto.setFechaUltimaEntrada(
                    usuario.getEntradasDiarias()
                            .getLast().getFecha()
            );
        }

        return resumenDto;
    }
}
