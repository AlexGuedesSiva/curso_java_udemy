package fundamentos;

import java.util.Scanner;

public class DesafioFhrenheitParaCelsius {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe a Temperatura Em Fhrenheit: ");
		double num1 = entrada.nextDouble();
		
		double resultado = (num1 - 32) / 1.8;
		
		System.out.printf("Valor de Celsius: %.2f", resultado);
		
		entrada.close();
		
	}

}

