package fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		int a = 6;
		int b = 3;
		int c = 2;
		int cal1 = a*(b+c);
		int soma1 = (int) Math.pow(cal1, 2);
		int final1 = soma1/(3*2);
		//Aqui termina a primeira parte
		
		int d = 4;
		int e = 5;
		int cal2 = (d*e)/2;
		int final2 = (int) Math.pow(cal2, 2);
		
		
		int finalGeral = final1-final2;
		int finalGeral2 = (int) Math.pow(finalGeral, 3);
		
		int g = (int) Math.pow(10, 3);
		int somaFinal = finalGeral2/g;
		
		System.out.println(somaFinal);
	}
	
	
}
