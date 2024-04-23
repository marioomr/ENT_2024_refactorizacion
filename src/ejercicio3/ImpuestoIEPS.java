package ejercicio3;

/**
 * 
 * Clase que calcula el IEPS
 * 
 */

public class ImpuestoIEPS extends Impuesto {

	/**
	 * 
	 * Operacion que calcula y devuelve el IEPS
	 * 
	 * @param ingresos
	 * 
	 * @return
	 * 
	 */

	public double calcular(double ingresos) {

		double impuesto = ingresos * 0.05;

		return impuesto;

	}

}