package ar.edu.unlp.info.oo2.ejercicio_4_p3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;

public class Decodificador {
	private List<Pelicula> grilla;
	private List<Pelicula> vistas;
	private EstrategiaDeSugerencia configuracionDeSugerencia;
	
	public Decodificador() {
		this.grilla = new ArrayList<Pelicula>();
		this.vistas = new ArrayList<Pelicula>();
	}
	
	public void addPelicula(Pelicula pelicula) {
		this.grilla.add(pelicula);
	}
	
	public void reproducirPelicula(Pelicula pelicula) {
		if (this.grilla.contains(pelicula)) {
			this.vistas.add(pelicula);
		}
	}
	
	public void configurarSugerencia(EstrategiaDeSugerencia configuracionDeSugerencia) {
		this.configuracionDeSugerencia = configuracionDeSugerencia;
	}
	
	
	public List<Pelicula> sugerir() {
		return this.configuracionDeSugerencia.sugerir(this.grilla, this.vistas);
	}
	
	public EstrategiaDeSugerencia getConfiguracionDeSugerencia() {
		return this.configuracionDeSugerencia;
	}

}
