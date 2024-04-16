package ejercicio1;

public class Dividir {
	
	public int dividir(int a, int b) { 
        if (b == 0) { 
            System.out.println("Error: No se puede dividir por cero."); 
            return 0; 
        } else {
            int resultado = a / b; 
            return resultado; 
        } 
    } 
}
