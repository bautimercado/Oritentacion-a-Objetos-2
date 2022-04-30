package ar.edu.unlp.info.oo2.ejercicio_3_p5.ejercicio_3_6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pelicula {
	private String nombre, genero;
	private LocalDate fechaEstreno;
	private double costo;
	
	public double getCosto() {
		return this.costo;
	}
	
	public double calcularCostoExtraPorEstreno() {
		return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) ) > 30 ? 0 : 300;
	}

}
