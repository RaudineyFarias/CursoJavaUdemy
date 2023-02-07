package fundamentos;

public class ConversaoTiposPrimitivos {
	public static void main(String[] args) {
		double a = 1; // Conversão Implicita 
		System.out.println(a);
		float b = (float) 1.123456788888; // conversão Explicita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; //Conversão de Inteiro para byte
		System.out.println(d);
	}

}
