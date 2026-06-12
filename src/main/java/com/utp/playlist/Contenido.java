package com.utp.playlist;

import java.util.ArrayList;
import java.util.List;

public abstract class Contenido {
    private String titulo;

    public Contenido(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void reproducir();
}