import java.util.Locale;

public class Substring {

    public static void main(String[] args) {
        String texto = "pneumoultramicroscopicossilicovulcanoconiótico";
        texto.toUpperCase(); //Dessa forma quando o usuário digitar as letras já ficarão maiusculas
        texto.toLowerCase(); //Dessa forma quando o usuário digitar as letras já ficarão minusculas



        //texto.endsWith(); //Dessa forma ele compara se as ultimas letras
        //texto.startsWith(); //Dessa forma ele compara se as primeiras letras




        System.out.println(texto.length());

        String OutroTexto = texto.substring(0, 46);//Dessa forma


        System.out.println(OutroTexto.toUpperCase());//Deixando a String maiscula
        System.out.println(OutroTexto.toLowerCase());//Deixando a String minuscula


    }
}
