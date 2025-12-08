package com.info.moodtrack.moodtrack.repository.entradadiaria;

import com.info.moodtrack.moodtrack.model.EntradaDiaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

public interface EntradaDiariaRepository extends JpaRepository<EntradaDiaria, Long> {

    int countByUsuarioId(UUID id);

    @Query("SELECT MAX(e.fecha) FROM EntradaDiaria e WHERE e.usuario.id = :id")
    Optional<LocalDate> findUltimaFecha(UUID id);

}
