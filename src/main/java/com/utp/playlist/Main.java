package com.utp.playlist;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Contenido> miPlaylist = new ArrayList<>();

		miPlaylist.add(
			new Cancion(
				"Blinding Lights",
				"The Weeknd"
			)
		);
		miPlaylist.add(
			new Podcast(
				"Café con Tech",
				42
			)
		);

		for (Contenido c : miPlaylist) {
			c.reproducir();
		}
	}
}
