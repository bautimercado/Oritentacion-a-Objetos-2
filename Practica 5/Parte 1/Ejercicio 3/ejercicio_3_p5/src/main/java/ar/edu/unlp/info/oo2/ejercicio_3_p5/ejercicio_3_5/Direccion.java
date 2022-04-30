package ar.edu.unlp.info.oo2.ejercicio_3_p5.ejercicio_3_5;

public class Direccion {
	private String localidad, calle, numero, departamento;

	public String getLocalidad() {
		return localidad;
	}

	public String getCalle() {
		return calle;
	}

	public String getNumero() {
		return numero;
	}

	public String getDepartamento() {
		return departamento;
	}
	
	public String getDireccionFormateada() {
	    return 
	        this.localidad + ", " +
	        this.calle + ", " +
	        this.numero + ", " +
	        this.departamento;
	}

}
