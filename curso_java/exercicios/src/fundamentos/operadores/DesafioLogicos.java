package fundamentos.operadores;




public class DesafioLogicos {
	public static void main(String[] args) {
		
		//Trabalho Na terça (V ou F)
		//Trabalho na quinta (V ou F)
		
		/*Se trabalhou os dois derem certo = comprar a Tv de 50 Polegadas
		 * Se apenas um dos dois derem certo comprar a tv 32 Polegadas
		 * Se Ou exclusivo a Familia vai ao shopping comemorar tomando sorvete 
		 * 
		 * Se nenhum do dois derem certo significa dizer que a familia irá ficar em casa
		 * 
		 */
			
			
		
		
			boolean trabalho1 = true;
			boolean trabalho2 = false;
			
			boolean compraTV50 =trabalho1 && trabalho2;
			boolean compraTV32 = trabalho1 || trabalho2;
			boolean Sorvete = trabalho1 ^ trabalho2;
			boolean FamiliaEmCasa = !trabalho1 ;
			
			System.out.println("comprar TV de 50? "+compraTV50);
			System.out.println("Comprar TV 32? "+compraTV32); 
			System.out.println("Levar Familia para tomar Sorvete? "+Sorvete);
			System.out.println("Familia fica em casa? "+FamiliaEmCasa);

			
		
		
		
	}
}
