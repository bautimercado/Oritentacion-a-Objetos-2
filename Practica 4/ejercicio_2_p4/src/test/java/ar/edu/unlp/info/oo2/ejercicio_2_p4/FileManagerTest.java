package ar.edu.unlp.info.oo2.ejercicio_2_p4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileManagerTest {
	private FileManager fileManager;
	private Archivo a;
	
	@BeforeEach
	void setUp() {
		this.a = new Archivo("ejercicio1", ".java", 1000d, LocalDate.of(2022, 4, 23),
				LocalDate.of(2022, 4, 24), "Lectura-Escritura");
		this.fileManager = new FileManager(a);
	}
	
	@Test
	void testNombreExtension() {
		DecoradorExtension e = new DecoradorExtension();
		this.fileManager.agregarAspectoAMostrar(e);
		
		DecoradorNombre n = new DecoradorNombre();
		this.fileManager.agregarAspectoAMostrar(n);
		
		assertEquals("ejercicio1 - .java", this.fileManager.prettyPrint());
	}
	
	@Test
	void testNombreExtensionFechaDeCreacion() {
		DecoradorFechaDeCreacion fc = new DecoradorFechaDeCreacion();
		this.fileManager.agregarAspectoAMostrar(fc);
		
		DecoradorExtension e = new DecoradorExtension();
		this.fileManager.agregarAspectoAMostrar(e);
		
		DecoradorNombre n = new DecoradorNombre();
		this.fileManager.agregarAspectoAMostrar(n);
		
		assertEquals("ejercicio1 - .java - 2022-04-23", this.fileManager.prettyPrint());
	}
	
	@Test
	void testPermisosNombreExtensionTamaño() {
		DecoradorTamanio t = new DecoradorTamanio();
		this.fileManager.agregarAspectoAMostrar(t);
		
		DecoradorExtension e = new DecoradorExtension();
		this.fileManager.agregarAspectoAMostrar(e);
		
		DecoradorNombre n = new DecoradorNombre();
		this.fileManager.agregarAspectoAMostrar(n);
		
		DecoradorPermisos p = new DecoradorPermisos();
		this.fileManager.agregarAspectoAMostrar(p);
		
		assertEquals("Lectura-Escritura - ejercicio1 - .java - 1000.0", this.fileManager.prettyPrint());
	}
	
}
