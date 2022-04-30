package ar.edu.unlp.info.oo2.ejercicio_3_p5.ejercicio_3_4;

public class ItemCarrito {
	private Producto producto;
    private int cantidad;
        
    public Producto getProducto() {
        return this.producto;
    }
    
    public int getCantidad() {
        return this.cantidad;
    }
    
    public double getMonto() {
    	return this.producto.getPrecio() * this.cantidad;
    }
}
