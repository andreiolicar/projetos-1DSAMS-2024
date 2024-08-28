
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira data (Dia/Mês/Ano): ");
        String data1String = scanner.nextLine();
        System.out.print("Digite a segunda data (Dia/Mês/Ano): ");
        String data2String = scanner.nextLine();

        String[] data1Partes = data1String.split("/");
        String[] data2Partes = data2String.split("/");

        int dia1 = Integer.parseInt(data1Partes[0]);
        int mes1 = Integer.parseInt(data1Partes[1]);
        int ano1 = Integer.parseInt(data1Partes[2]);

        int dia2 = Integer.parseInt(data2Partes[0]);
        int mes2 = Integer.parseInt(data2Partes[1]);
        int ano2 = Integer.parseInt(data2Partes[2]);

        if (ano1 < ano2 || (ano1 == ano2 && mes1 < mes2) || (ano1 == ano2 && mes1 == mes2 && dia1 < dia2)) {
            System.out.println("Ordem crescente: " + data1String + ", " + data2String);
        } else if (ano1 > ano2 || (ano1 == ano2 && mes1 > mes2) || (ano1 == ano2 && mes1 == mes2 && dia1 > dia2)) {
            System.out.println("Ordem decrescente: " + data1String + ", " + data2String);
        } else if (ano1 == ano2 && mes1 == mes2 && dia1 == dia2) {
            System.out.println("As datas são iguais.");
        } else {
            System.out.println("Formato de data inválido. Use o formato Dia/Mês/Ano.");
        }
    }
}
