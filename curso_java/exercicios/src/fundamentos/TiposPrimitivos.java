package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// informações de funcinoários
		
		//tipos numericosa
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223l;
		
		// Tpos numericos reais
		float salario = 11_445.45F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo Boleano
		boolean estaDeFerias = false; //true
		
		// Tipo Caractere
		char status = 'A'; //ativo
		
		//Dias de empresa 
		System.err.println(anosDeEmpresa *365);
		
		// Numero de viagens
		System.out.println(numeroDeVoos /2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": Ganha -> "+salario);
		System.out.println("Férias? "+ estaDeFerias);
		System.out.println("Status: "+ status);
		
	}

}
