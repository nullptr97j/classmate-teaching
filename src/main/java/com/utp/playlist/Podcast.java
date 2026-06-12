package com.utp.playlist;

public class Podcast extends Contenido {

	private int numeroEpisodio;

	public Podcast(String titulo, int numeroEpisodio) {
		super(titulo);
		this.numeroEpisodio = numeroEpisodio;
	}

	@Override
	public void reproducir() {
		System.out.println(
			"Reproduciendo Podcast: " + getTitulo() +
			" (Episodio " + numeroEpisodio + ")"
		);
	}
}
