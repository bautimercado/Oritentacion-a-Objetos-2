package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaFisica extends Persoona {
	private String dni;
	
	public PersoonaFisica(String nombreYApellido, String dni) {
		super(nombreYApellido);
		this.dni = dni;
	}
	
	public double getDescuento() {
		return 0;
	}

}
