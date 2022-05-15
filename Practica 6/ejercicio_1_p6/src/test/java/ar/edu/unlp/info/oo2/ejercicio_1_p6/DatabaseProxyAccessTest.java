package ar.edu.unlp.info.oo2.ejercicio_1_p6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyAccessTest {
	private DatabaseAccess database;
	private DatabaseProxyAccess proxy;
	
	@BeforeEach
	void setUp() {
		this.database = new DatabaseRealAccess();
		this.proxy = new DatabaseProxyAccess(this.database, "123456789");
	}
	
	@Test
	void testLogin() {
		assertFalse(proxy.login("qwerty"));
		assertFalse(proxy.isLogged());
		
		assertTrue(proxy.login("123456789"));
		assertTrue(proxy.isLogged());
	}
	
	@Test
	void testInsertNewRow() {
		assertEquals(-1, proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
		
		proxy.login("123456789");
		
		assertEquals(3, proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
	}
	
	@Test
	void testGetSearchResults() {
		assertEquals(Collections.emptyList(), proxy.getSearchResults("select * from comics where id=2"));
		
		proxy.login("123456789");
		
		assertEquals(Arrays.asList("Spiderman", "Marvel"), proxy.getSearchResults("select * from comics where id=1"));
		assertEquals(Arrays.asList("Batman", "DC comics"), proxy.getSearchResults("select * from comics where id=2"));
	}
}
