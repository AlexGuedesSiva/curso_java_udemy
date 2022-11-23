package fundamentos;

import java.util.Scanner;

public class DesafioCalcularImc {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String inicio = "Calcular o IMC \n";
		System.out.println(inicio.toUpperCase());
		
		System.out.printf("Inserir Peso: ");
		double peso = entrada.nextDouble();
		
		System.out.printf("Inserir a altura: ");
		double altura = entrada.nextDouble();
		
		double resultado = peso / (altura * 2);
		
		System.out.printf("O seu IMC é: %.2f",resultado);
		
		entrada.close();
;		
	}

}
