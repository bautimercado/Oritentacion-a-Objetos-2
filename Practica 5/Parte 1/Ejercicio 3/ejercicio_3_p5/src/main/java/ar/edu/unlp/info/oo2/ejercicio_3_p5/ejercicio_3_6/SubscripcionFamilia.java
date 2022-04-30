package ar.edu.unlp.info.oo2.ejercicio_3_p5.ejercicio_3_6;

public class SubscripcionFamilia implements Subscripcion {

	public double calcularPrecioPelicula(Pelicula p) {
		return (p.getCosto() + p.calcularCostoExtraPorEstreno()) * 0.90;
	}
}
