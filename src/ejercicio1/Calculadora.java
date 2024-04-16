package ejercicio1;

public class Calculadora {	

	public int sumar(int sumando1, int sumando2) { 
	        int resultado = sumando1 + sumando2; 
	        return resultado; 
	    } 

	    public int restar(int minuendo, int sustraendo) { 
	        int resultado = minuendo - sustraendo; 
	        return resultado; 
	    }

	    public int multiplicar(int factor1, int factor2) { 
	        int resultado = factor1 * factor2; 
	        return resultado; 
	    } 

	    public int dividir(int dividendo, int divisor) { 
	        if (divisor == 0) { 
	            
	        	//TODO DIVISION POR CERO. ¿LANZAR EXCEPCION?
	        	return 0; 

	        } else { 
	            int resultado = dividendo / divisor; 
	            return resultado; 
	        } 
	    } 

	    public static void main(String[] args) { 
	       
	    	Calculadora calc = new Calculadora(); 

	        System.out.println("Suma: " + calc.sumar(10, 5)); 
	        System.out.println("Resta: " + calc.restar(10, 5)); 
	        System.out.println("Multiplicación: " + calc.multiplicar(10, 5)); 
	        System.out.println("División: " + calc.dividir(10, 5)); 

	    } 

	
}
