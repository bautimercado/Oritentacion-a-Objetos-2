package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaJuridica extends Persoona {
	private String cuit;
	
	public PersoonaJuridica(String nombreYApellido, String cuit) {
		super(nombreYApellido);
		this.cuit = cuit;
	}
	
	public double getDescuento() {
		return 0.15;
	}
}
