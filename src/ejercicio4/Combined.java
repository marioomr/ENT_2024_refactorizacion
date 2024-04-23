package ejercicio4;

public class Combined {
	
	public static final int SUMA = 1000;
	public static final int RESTA = 2000;

	public int operacion(int operador1, int operador2,int operacion) throws Exception {
		
		switch(operacion) {
		
			case SUMA: return operador1+operador2;
			case RESTA: return operador1-operador2;
			default: throw new Exception("Operacion incorrecta");
		}
		
		
	}
	
	
	public int sumar(int a,int b) {
		return a + b;
	}
	
	public int restar(int a, int b ) {
		return a - b;
	}
	
}
