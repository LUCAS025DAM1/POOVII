package EJERCICIO3;

public class ej3 {

	public static void main(String[] args) {
		 double kilometros = 10;
	        double millas = 6.21371;
	        double celsius = 25;
	        double fahrenheit = 77;

	        System.out.println(kilometros + " kilómetros son " + ConvertidorUnidades.kilometrosAMillas(kilometros) + " millas.");
	        System.out.println(millas + " millas son " + ConvertidorUnidades.millasAKilometros(millas) + " kilómetros.");
	        System.out.println(celsius + " grados Celsius son " + ConvertidorUnidades.celsiusAFahrenheit(celsius) + " grados Fahrenheit.");
	        System.out.println(fahrenheit + " grados Fahrenheit son " + ConvertidorUnidades.fahrenheitACelsius(fahrenheit) + " grados Celsius.");
	    }
	}

