package ar.edu.unlp.info.oo2.ejercicio_9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	private Dispositivo dispositivo;
	
	@BeforeEach
	void setUp() {
		dispositivo = new Dispositivo();
		dispositivo.cambiarConexion(new WifiConn());
		dispositivo.configurarCRC(new CRC_16Calculator());
	}
	
	@Test
	void testSend() {
		assertEquals("Wifi datos", dispositivo.sendOperation("datos"));
	}
	
	@Test
	void testConectarCon() {
		assertEquals(new WifiConn(), dispositivo.getConnection());
		this.dispositivo.cambiarConexion(new Conn4gAdapter());
		assertEquals(new Conn4gAdapter(), this.dispositivo.getConnection());
	}
	
	@Test
	void testConfigurarCRC() {
		assertEquals(new CRC_16Calculator().getClass(), this.dispositivo.getCRC().getClass());
		this.dispositivo.configurarCRC(new CRC_32Calculator());
		assertEquals(new CRC_32Calculator().getClass(), this.dispositivo.getCRC().getClass());
	}
}
