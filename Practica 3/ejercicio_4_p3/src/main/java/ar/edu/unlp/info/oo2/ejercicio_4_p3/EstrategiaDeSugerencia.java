package ar.edu.unlp.info.oo2.ejercicio_4_p3;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class EstrategiaDeSugerencia {
	protected List<Pelicula> filtarPeliculasNoVistas(List<Pelicula> grilla, List<Pelicula> vistas){
		return grilla.stream()
				.filter((Pelicula p) -> !vistas.contains(p))
				.collect(Collectors.toList());
	}
	
	public abstract List<Pelicula> sugerir(List<Pelicula> grilla, List<Pelicula> vistas);

}
