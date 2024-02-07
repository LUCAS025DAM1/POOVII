package EJERCICIO1;

public class ContadorInstancias {
	 private static int contadorInstancias = 0;
	    
	    public ContadorInstancias() {
	        contadorInstancias++;
	    }
	    public static int obtenerNumeroInstancias() {
	        return contadorInstancias;
	    }
}
