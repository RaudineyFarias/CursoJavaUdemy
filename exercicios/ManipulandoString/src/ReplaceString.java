public class ReplaceString {
    public static void main(String[] args) {

        String texto = "O Brasil vai ter picanha em 2023";

        String Resultado;

        Resultado = texto.replace("picanha", "Carne de charque");

        //O replace ele substitui o valor digitado no campo da primeira virgula de seu metodo.

        System.out.println("resultado "+ Resultado);
    }
}
