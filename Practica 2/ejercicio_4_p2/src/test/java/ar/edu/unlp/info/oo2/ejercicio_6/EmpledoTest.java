package ar.edu.unlp.info.oo2.ejercicio_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpledoTest {
	private Temporario t1, t2, t3;
	private Pasante pa1, pa2;
	private Planta pl1, pl2, pl3;
	
	@BeforeEach
	void setUp() {
		t1 = new Temporario(0, false, 0);
		t2 = new Temporario(12, false, 0);
		t3 = new Temporario(12, true, 1);
		pa1 = new Pasante(0);
		pa2 = new Pasante(2);
		pl1 = new Planta(false, 0, 0);
		pl2 = new Planta(true, 0, 4);
		pl3 = new Planta(true, 2, 1);
	}
	
	@Test
	void testSueldos() {
		assertEquals(17400, t1.sueldo());
		assertEquals(20532, t2.sueldo());
		assertEquals(27182, t3.sueldo());
		assertEquals(17400, pa1.sueldo());
		assertEquals(21200, pa2.sueldo());
		assertEquals(43500, pl1.sueldo());
		assertEquals(55850, pl2.sueldo());
		assertEquals(53950, pl3.sueldo());
	}
}
