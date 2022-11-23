package fundamentos.DesafioFundamentos;

public class DesafioFormulaBhaskara {
	public static void main(String[] args) {
		
		double a = 2;
		double b = -16;
		double c = -18;
		
		double delta = Math.pow(b, 2) - ((4 * a)* c);
		System.out.printf("DELTA = %.2f\n\n", delta);
		
		double den1 = (-b) + Math.sqrt(delta); 
		double den2 = (-b) - Math.sqrt(delta);
		double num1 = (2 * a);
		
		double x1 = den1 / num1;
		
		double x2 = den2 / num1;
		
		
		System.out.printf("O valor do X1 = %.2f \n",x1);
		System.out.printf("O valor do X2 = %.2f",x2);
	}

}
