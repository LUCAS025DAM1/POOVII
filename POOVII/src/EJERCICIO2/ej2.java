package EJERCICIO2;

public class ej2 {

	public static void main(String[] args) {
		double num1 = 10;
        double num2 = 5;

        System.out.println("Suma: " + num1 + " + " + num2 + " = " + CalculadoradeFlorentinoPerez.sumar(num1, num2));
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + CalculadoradeFlorentinoPerez.restar(num1, num2));
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + CalculadoradeFlorentinoPerez.multiplicar(num1, num2));
        System.out.println("División: " + num1 + " / " + num2 + " = " +CalculadoradeFlorentinoPerez.dividir(num1, num2));
    }
}

