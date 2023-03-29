import java.util.Calendar;
import java.util.Scanner;

public class Exercicio_data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Solicitar a data1
        System.out.println("Digite a data 1 (dd/mm/aaaa):");
        String data1 = sc.nextLine();

//Solicitar a data2
        System.out.println("Digite a data 2 (dd/mm/aaaa):");
        String data2 = sc.nextLine();

//separar dia, mes e ano
        String[] partesData1 = data1.split("/");
        int diaData1 = Integer.parseInt(partesData1[0]);
        int mesData1 = Integer.parseInt(partesData1[1]);
        int anoData1 = Integer.parseInt(partesData1[2]);

        String[] partesData2 = data2.split("/");
        int diaData2 = Integer.parseInt(partesData2[0]);
        int mesData2 = Integer.parseInt(partesData2[1]);
        int anoData2 = Integer.parseInt(partesData2[2]);

//Criar os objetos Calendar

        Calendar calData1 = Calendar.getInstance();
        calData1.set(anoData1, mesData1-1, diaData1);
        calData1.set(Calendar.HOUR_OF_DAY, 0);
        calData1.set(Calendar.MINUTE, 0);
        calData1.set(Calendar.SECOND, 0);
        calData1.set(Calendar.MILLISECOND, 0);

        Calendar calData2 = Calendar.getInstance();
        calData2.set(anoData2, mesData2-1, diaData2);
        calData2.set(Calendar.HOUR_OF_DAY, 0);
        calData2.set(Calendar.MINUTE, 0);
        calData2.set(Calendar.SECOND, 0);
        calData2.set(Calendar.MILLISECOND, 0);
//printando as datas
//System.out.println(calData1.getTime().toString());
//System.out.println(calData2.getTime().toString());

//comparar as datas
        if(calData1.compareTo(calData2)==0){
            System.out.println("As datas são iguais");
        } else if(calData1.before(calData2)){
            System.out.println("Data1 é anterior a Data2");
        }else if(calData1.after(calData2)){
            System.out.println("Data1 é posterior a Data2");
        }
    }

}