package ar.edu.unlp.info.oo2.ejercicio_7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	ToDoItem tarea1, tarea2;
	
	@BeforeEach
	void setUp() {
		tarea1 = new ToDoItem("Tarea 1");
		tarea2 = new ToDoItem("Tarea 2");
	}
	
	@Test
	void testEstados() {
		tarea1.start();
		
		assertEquals("InProgress", tarea1.getEstado().getNombre());
		assertEquals("Pending", tarea2.getEstado().getNombre());
		
		tarea1.togglePaused();
		
		assertEquals("Paused", tarea1.getEstado().getNombre());
		
		tarea1.togglePaused();
		
		assertEquals("InProgress", tarea1.getEstado().getNombre());
		
		tarea1.finish();
		
		assertEquals("Finished", tarea1.getEstado().getNombre());
	}
	
	@Test
	void testComentarios() {
		tarea1.start();
		tarea2.start();
		tarea2.finish();
		
		tarea1.addComentario("c1");
		tarea1.addComentario("c2");
		tarea2.addComentario("c3");
		tarea1.addComentario("c4");
		
		assertEquals(3, tarea1.getComentarios().size());
		assertTrue(tarea2.getComentarios().isEmpty());
	}
	
	@Test
	void testExceptions() {
		Exception e = assertThrows(RuntimeException.class, () -> tarea1.workedTime());
    	String expectedMessage = "Can't return the worked time because its state is Pending";
    	assertEquals(expectedMessage, e.getMessage());
    	
    	e = assertThrows(RuntimeException.class, () -> tarea1.togglePaused());
    	expectedMessage = "ToDoItem can't paused because its state is Pending";
    	assertEquals(expectedMessage, e.getMessage());
    	
    	tarea1.start();
    	tarea1.finish();
    	
    	e = assertThrows(RuntimeException.class, () -> tarea1.togglePaused());
    	expectedMessage = "ToDoItem can't paused because its state is Finished";
    	assertEquals(expectedMessage, e.getMessage());
	}
}
