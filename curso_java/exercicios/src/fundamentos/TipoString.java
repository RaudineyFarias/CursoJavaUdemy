package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Mundo!".charAt(3));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("Bom"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("boa Tarde"));
		
		var nome = "Pedro";
		
		var sobrenome = "Santos";
		
		var idade = 33;
		
		var salario = 12345.987;
		
		System.out.println("Nome: "+nome+"\nSobrenome :"+sobrenome + "\nidade: " 
		+ idade + "\nSalario: "+idade+"\n\n");
		
		
		System.out.printf("O senhor %s %s e tem %d e ganha %f.", nome, sobrenome, idade, salario);
		
		// %s = strings %d Inteiros %f valores flutantes e pode definir quantas casas pode definir "%.2f"
		
		String frase = String.format("\nO senhor %s %s e tem %d e ganha %f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
	
	}

}
