package ar.edu.unlp.info.oo2.ejercicio_4_p3;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Novedad extends EstrategiaDeSugerencia {

	public List<Pelicula> sugerir(List<Pelicula> grilla, List<Pelicula> vistas){
		List<Pelicula> peliculas = filtarPeliculasNoVistas(grilla, vistas);
		
		return peliculas.stream()
			.sorted(Comparator.comparing(Pelicula::getAnioDeEstreno).reversed())
			.limit(3)
			.collect(Collectors.toList());
	}
	
	
}
