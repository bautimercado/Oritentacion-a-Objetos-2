package ar.edu.unlp.info.oo2.ejercicio_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	private TopografiaDeAgua agua;
	private TopografiaDeTierra tierra;
	private TopografiaComposite topografiaMixta1, topografiaMixta2, topografiaMixta3;
	
	@BeforeEach
	public void setUp() {
		agua = new TopografiaDeAgua();
		tierra = new TopografiaDeTierra();
		topografiaMixta1 = new TopografiaComposite();
		topografiaMixta2 = new TopografiaComposite();
		topografiaMixta3 = new TopografiaComposite();
		
		topografiaMixta1.addComponente(agua);
		topografiaMixta1.addComponente(tierra);
		topografiaMixta1.addComponente(tierra);
		topografiaMixta1.addComponente(agua);
		
		topografiaMixta2.addComponente(agua);
		topografiaMixta2.addComponente(tierra);
		topografiaMixta2.addComponente(tierra);
		topografiaMixta2.addComponente(topografiaMixta1);
		
		topografiaMixta3.addComponente(agua);
		topografiaMixta3.addComponente(tierra);
		topografiaMixta3.addComponente(tierra);
		topografiaMixta3.addComponente(new TopografiaDePantano());
	}
	
	@Test
	public void testProporcionDeAgua() {
		assertEquals(agua.proporcionDeAgua(), 1f);
		assertEquals(tierra.proporcionDeAgua(), 0f);
		assertEquals(topografiaMixta1.proporcionDeAgua(), 0.5f);
		assertEquals(topografiaMixta2.proporcionDeAgua(), 0.375f);
		assertEquals(topografiaMixta3.proporcionDeAgua(), 0.42499999701976776);
	}
	
	@Test
	public void testProporcionDeTierra() {
		assertEquals(agua.proporcionDeTierra(), 0f);
		assertEquals(tierra.proporcionDeTierra(), 1f);
		assertEquals(topografiaMixta1.proporcionDeTierra(), 0.5f);
		assertEquals(topografiaMixta2.proporcionDeTierra(), 0.625f);
		assertEquals(topografiaMixta3.proporcionDeTierra(), 0.5750000029802322);
		
	}
	
	@Test
	public void testTopografiasIguales() {
		TopografiaComposite tm1 = new TopografiaComposite();
		tm1.addComponente(agua);
		tm1.addComponente(tierra);
		tm1.addComponente(tierra);
		tm1.addComponente(agua);
		
		TopografiaComposite tm2 = new TopografiaComposite();
		tm2.addComponente(agua);
		tm2.addComponente(tierra);
		tm2.addComponente(tierra);
		tm2.addComponente(topografiaMixta1);
		
		TopografiaComposite tm3 = new TopografiaComposite();
		tm3.addComponente(agua);
		tm3.addComponente(tierra);
		tm3.addComponente(tierra);
		tm3.addComponente(new TopografiaDePantano());
		
		assertTrue(topografiaMixta2.equals(tm2));
		assertTrue(topografiaMixta1.equals(tm1));
		assertFalse(topografiaMixta2.equals(tm1));
		assertFalse(topografiaMixta1.equals(tm2));
		assertTrue(topografiaMixta3.equals(tm3));
	}
	
}
