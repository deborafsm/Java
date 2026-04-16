import java.util.Scanner;

public class ScannerVariaveis {
    static void main() {

        Scanner scn = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scn.nextLine();
        System.out.println("Ola, "+nome+", estou voltando para o Java");

        System.out.println("Digite sua idade: ");
        int idade =scn.nextInt();
        System.out.println("sua idade é "+idade);
    }
}
