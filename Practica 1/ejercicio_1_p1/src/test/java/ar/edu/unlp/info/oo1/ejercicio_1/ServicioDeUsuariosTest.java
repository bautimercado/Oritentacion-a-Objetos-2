package ar.edu.unlp.info.oo1.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ServicioDeUsuariosTest {
	private ServicioDeUsuarios servicio;
	
	//private Usuario usuario1, usuario2, usuario3;
	
	@BeforeEach
	public void setUp() {
		servicio = new ServicioDeUsuarios();
		
		servicio.registrarUsuario("Juan");
		servicio.registrarUsuario("Maria");
		servicio.registrarUsuario("Jose");
	}
	
	@Test
	public void testUsuarios() {
		assertEquals(servicio.getUsuarios().size(), 3);
		
		servicio.registrarUsuario("Bautista");
		
		assertEquals(servicio.getUsuarios().size(), 4);
	}
	
	@Test
	public void testUsuariosRepetidos() {
		servicio.registrarUsuario("Juan");
		//System.out.println(servicio.getUsuarios().size());
		assertEquals(servicio.getUsuarios().size(), 3);
	}
	
}
