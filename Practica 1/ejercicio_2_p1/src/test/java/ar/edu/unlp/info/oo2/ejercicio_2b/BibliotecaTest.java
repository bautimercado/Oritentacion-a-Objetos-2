package ar.edu.unlp.info.oo2.ejercicio_2b;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.ejercicio_2b.Biblioteca;

public class BibliotecaTest {
	
	Biblioteca biblioteca;

	@BeforeEach
	public void setUp() {
		biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		
	}
	
	@Test
	public void testExporter() {
		VoorheesExporter exporter = biblioteca.getExporter();
		
		List<Socio> lista = new ArrayList<Socio>();
		
		assertEquals(exporter.exportar(lista), "[]");
		assertNotEquals(biblioteca.exportarSocios(), "[]");
	}


}
