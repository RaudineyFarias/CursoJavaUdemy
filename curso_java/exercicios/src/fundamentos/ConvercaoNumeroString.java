package fundamentos;

public class ConvercaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		//Para converter Numero que já esteja do tipo Integer
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		// para converter Numero inteiro em String use o Integer
		
		
		System.out.println((""+num1).length());
		System.out.println((""+num2).length());
		//Converter Numero Inteiro Utilizando a concatenação
	}

}
