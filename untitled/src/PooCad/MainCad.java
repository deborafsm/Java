package PooCad;

import java.util.Scanner;

public class MainCad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos lendas deseja adicionar ?");
        int quantidade = input.nextInt();
        input.nextLine();

        for (int i = 0; i < quantidade; i ++){
            ModelCad cadastro = new ModelCad();

            System.out.printf("Nome: ");
            cadastro.nome = input.nextLine();

            System.out.printf("Classe: ");
            cadastro.classe = input.nextLine();

            System.out.printf("Raça: ");
            cadastro.raca = input.nextLine();

            System.out.println("\nLendas:");
            System.out.println("Lenda: "+cadastro.nome);
            System.out.println("Classe: "+cadastro.classe);
            System.out.println("Raça: "+cadastro.raca);
        }
    }
}