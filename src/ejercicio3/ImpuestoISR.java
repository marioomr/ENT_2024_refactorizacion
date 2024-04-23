package ejercicio3;

/**
 * 
 * Clase que calcula el IRS
 * 
 */

public class ImpuestoISR extends Impuesto {

	/**
	 * 
	 * Operacion que calcula y devuelve el IRS
	 * 
	 * @param ingresos
	 * 
	 * @return
	 * 
	 */

	public double calcular(double ingresos) {

		double impuesto;

		if (ingresos < 50000) {

			impuesto = ingresos * 0.20;

		}

		else {

			impuesto = ingresos * 0.30;

		}

		return impuesto;
	}

}