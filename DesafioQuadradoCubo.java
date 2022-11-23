package fundamentos;

import java.util.Scanner;

public class DesafioQuadradoCubo {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Inserir o valor: ");
		double valor = entrada.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		
		
		System.out.println("Ao Quadrado: " + quadrado);
		System.out.printf("Ao Cubo: %.2f", cubo);
		
		
		
		
		entrada.close();
	}

}
