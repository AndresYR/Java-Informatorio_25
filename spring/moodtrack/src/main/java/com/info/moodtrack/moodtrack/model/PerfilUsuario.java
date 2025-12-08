package com.info.moodtrack.moodtrack.model;

import jakarta.persistence.*;

@Entity
public class PerfilUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String bio;

    @Column(nullable = false, length = 50)
    private String colorFavorito;

    @Column(nullable = false, length = 200)
    private String fraseDelDia;

    public PerfilUsuario() {
    }

    public PerfilUsuario(Long id, String bio, String colorFavorito, String fraseDelDia) {
        this.id = id;
        this.bio = bio;
        this.colorFavorito = colorFavorito;
        this.fraseDelDia = fraseDelDia;
    }

    public String getFraseDelDia() {
        return fraseDelDia;
    }

    public void setFraseDelDia(String fraseDelDia) {
        this.fraseDelDia = fraseDelDia;
    }

    public String getColorFavorito() {
        return colorFavorito;
    }

    public void setColorFavorito(String colorFavorito) {
        this.colorFavorito = colorFavorito;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
