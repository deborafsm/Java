package Hero;

import java.util.Scanner;

public class MainPooHero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos herois deseja cadastrar? ");
        int quantidade = sc.nextInt();
        sc.nextLine(); // limpa ENTER

        PooHero[] herois = new PooHero[quantidade];

        // CADASTRO
        for (int i = 0; i < quantidade; i++) {

            herois[i] = new PooHero();

            System.out.println("\nHeroi " + (i + 1));

            System.out.print("Digite o nome: ");
            herois[i].nome = sc.nextLine();

            System.out.print("Digite a raça: ");
            herois[i].raca = sc.nextLine();

            System.out.print("Digite a classe: ");
            herois[i].classe = sc.nextLine();

            System.out.print("Digite a idade: ");
            herois[i].idade = sc.nextInt();
            sc.nextLine(); // limpa ENTER

            System.out.println("=====================");
        }

        // EXIBIÇÃO
        System.out.println("\n=== HERÓIS CADASTRADOS ===");
        for (int i = 0; i < quantidade; i++) {
            herois[i].apresentar();
        }

        sc.close();
    }
}