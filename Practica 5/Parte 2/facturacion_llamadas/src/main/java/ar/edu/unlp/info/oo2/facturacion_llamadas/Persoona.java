package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {
	public List<Llamada> llamadas;
	public String tipo;    //tipo
	public String nombreYApellido;  //nombre
	public String telefono;
	//public String cuit;
	//public String documento;
	//public Persoonal sistema;
	
	public Persoona(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
		llamadas = new ArrayList<Llamada>();
	}
	
	public void addLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}
	
	public List<Llamada> getLista1() {
		return llamadas;
	}
	public void setLista1(List<Llamada> llamadas) {
		this.llamadas = llamadas;
	}
	
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	
	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public abstract double getDescuento();
	
	public double calcularMontoTotalLlamadas() {
		return this.llamadas.stream()
				.mapToDouble(a -> (a.calcularMonto() - (a.calcularMonto() * this.getDescuento())))
				.sum();
	}
	
}
