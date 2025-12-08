package com.info.moodtrack.moodtrack.mapper.usuario;

import com.info.moodtrack.moodtrack.dto.usuario.UsuarioResumenDto;
import com.info.moodtrack.moodtrack.model.Usuario;

import java.time.LocalDate;

public final class UsuarioResumenMapper {

    public UsuarioResumenMapper() {}

    public static UsuarioResumenDto resumenDto(Usuario usuario, int cantidadEntradas, LocalDate fechaUltimaEntrada) {

        UsuarioResumenDto resumenDto = new UsuarioResumenDto();

        resumenDto.setNombre( usuario.getNombre() );
        resumenDto.setEmail( usuario.getEmail() );
        resumenDto.setColorFavorito( usuario.getPerfil().getColorFavorito() );
        resumenDto.setCantidadEntradas(cantidadEntradas);
        resumenDto.setFechaUltimaEntrada(fechaUltimaEntrada);
//        resumenDto.setCantidadEntradas( usuario.getEntradasDiarias().size() );
//
//        if (resumenDto.getCantidadEntradas() != 0) {
//            resumenDto.setFechaUltimaEntrada(
//                    usuario.getEntradasDiarias()
//                            .getLast().getFecha()
//            );
//        }

        return resumenDto;
    }
}
