package ar.edu.unlp.info.oo2.ejercicio_3_p5.ejercicio_3_4;

import java.util.List;

public class Carrito {
	private List<ItemCarrito> items;
    
	public double total() {
		return this.items.stream()
				.mapToDouble(item -> item.getMonto())
				.sum();
    }
}
