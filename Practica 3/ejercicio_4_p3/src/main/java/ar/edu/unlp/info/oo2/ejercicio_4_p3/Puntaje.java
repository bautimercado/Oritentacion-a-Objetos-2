package ar.edu.unlp.info.oo2.ejercicio_4_p3;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class Puntaje extends EstrategiaDeSugerencia {
	
	public List<Pelicula> sugerir(List<Pelicula> grilla, List<Pelicula> vistas) {
		List<Pelicula> peliculas = filtarPeliculasNoVistas(grilla, vistas);
		
		return peliculas.stream()
				.sorted(Comparator.comparingDouble(Pelicula::getPuntaje).reversed()
				.thenComparing(Comparator.comparingInt(Pelicula::getAnioDeEstreno).reversed()))
				.limit(3)
				.collect(Collectors.toList());
		
		
	}

}
