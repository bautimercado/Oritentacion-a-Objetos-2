package ar.edu.unlp.info.oo2.ejercicio_4_p3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;

public class Similaridad extends EstrategiaDeSugerencia {
	
	public List<Pelicula> sugerir(List<Pelicula> grilla, List<Pelicula> vistas){
		List<Pelicula> peliculas = filtarPeliculasNoVistas(grilla, vistas);
		peliculas = peliculas.stream()
				.sorted(Comparator.comparing(Pelicula::getAnioDeEstreno).reversed())
				.collect(Collectors.toList());
		
		return peliculas.stream()
				.filter(p -> p.getSimilares().stream()
									.anyMatch(aux -> aux.getSimilares().contains(p)))
				.limit(3)
				.collect(Collectors.toList());
		
	}

}
