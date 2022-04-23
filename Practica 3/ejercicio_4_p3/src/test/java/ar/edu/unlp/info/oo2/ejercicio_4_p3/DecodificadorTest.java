package ar.edu.unlp.info.oo2.ejercicio_4_p3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

public class DecodificadorTest {
	private Decodificador decoder;
	
	private Pelicula p1, p2, p3, p4, p5, p6;
	
	@BeforeEach
	void setUp() {
		decoder = new Decodificador();
		
		p1 = new Pelicula("El padrino", 9.9d, 1974);
		p2 = new Pelicula("Scarface", 8.6d, 1983);
		p3 = new Pelicula("Pulp fiction", 9.4d, 1993);
		p4 = new Pelicula("Batman dark knight", 9.5d, 2009);
		p5 = new Pelicula("The Batman", 9.1d, 2022);
		p6 = new Pelicula("Midsommar", 9.1d, 2019);
		
		p1.addSimilitud(p2);
		p1.addSimilitud(p3);
		p2.addSimilitud(p1);
		p2.addSimilitud(p3);
		p3.addSimilitud(p1);
		p3.addSimilitud(p2);
		p4.addSimilitud(p5);
		p5.addSimilitud(p4);
		
		decoder.addPelicula(p1);
		decoder.addPelicula(p2);
		decoder.addPelicula(p3);
		decoder.addPelicula(p4);
		decoder.addPelicula(p5);
		decoder.addPelicula(p6);
		
		decoder.reproducirPelicula(p1);
		decoder.reproducirPelicula(p4);
	}
	
	@Test
	void testSugerenciaNovedad() {
		decoder.configurarSugerencia(new Novedad());
		List<Pelicula> novedades = decoder.sugerir();
		
		assertEquals(3, novedades.size());
		
		assertEquals(p5, novedades.get(0));
		assertEquals(p6, novedades.get(1));
		assertEquals(p3, novedades.get(2));
	}
	
	@Test
	void testSugerenciaSimilaridad() {
		decoder.configurarSugerencia(new Similaridad());
		List<Pelicula> similares = decoder.sugerir();
		
		assertEquals(3, similares.size());
		
		assertEquals(p5, similares.get(0));
		assertEquals(p3, similares.get(1));
		assertEquals(p2, similares.get(2));
		
	}
	
	@Test
	void testSugerenciaPuntaje() {
		decoder.configurarSugerencia(new Puntaje());
		List<Pelicula> porPuntaje = decoder.sugerir();
		
		assertEquals(3, porPuntaje.size());
		
		assertEquals(p3, porPuntaje.get(0));
		assertEquals(p5, porPuntaje.get(1));
		assertEquals(p6, porPuntaje.get(2));
	}	
}
