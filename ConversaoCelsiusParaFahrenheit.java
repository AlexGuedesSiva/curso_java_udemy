package fundamentos;

import java.util.Scanner;

public class ConversaoCelsiusParaFahrenheit {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Informe a Temperatura Em Celsius: ");
		double num1 = entrada.nextDouble();

		double resultado = (num1 * 1.8) + 32;

		System.out.printf("Valor Temperatura em Fahrenheit: %.2f", resultado);

		entrada.close();

	}

}
