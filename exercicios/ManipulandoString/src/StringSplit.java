public class StringSplit {

    public static void main(String[] args) {

        String texto = "No:Caso:Do:IFPB";

        String[] Resultado;

        Resultado = texto.split(":");

        //O Split Separa os valores digitados seu metodo, neste exemplo ele vai separar tudo o que está entre o
        //Caracter ";" indicado no metodo;

        System.out.println("resultado Do Split --> "+ Resultado[3]);

        // Passando a posição ele imprime somente aquela
        // palavra da posição no qual foi indicada
    }
}
