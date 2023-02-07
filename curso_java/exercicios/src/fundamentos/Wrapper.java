package fundamentos;


public class Wrapper {
	public static void main(String[] args) {
		
		
		//Integer.parseInt(entrada.next()); - p/ converter string em Int
		// byte 
		Byte b = 127;
		Short s = 1000;
		
		//int
		Integer i =  10000;
		Long l = 100000L;
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l/3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); //converter String em valor booleano
		System.out.println(bo.toString().toUpperCase()); //converter valor booleano em String
		System.out.println((""+bo).toUpperCase()); //outra forma de converter o valor booleano em String
		
		Character c = '#';
		System.out.println(c.toString());//converter caracter em String
		
		
	}
}
