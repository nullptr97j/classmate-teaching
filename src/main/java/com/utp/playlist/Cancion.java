package com.utp.playlist;

public class Cancion extends Contenido {

	private String artista;

	public Cancion(String titulo, String artista) {
		super(titulo);
		this.artista = artista;
	}

	@Override
	public void reproducir() {
		System.out.println(
			"Reproduciendo canción: "
			+ getTitulo() + " por " + artista
		);
	}
}
