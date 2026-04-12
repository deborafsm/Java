package PooCad;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos lendas deseja adicionar ?");
        int quantidade = input.nextInt();
        input.nextLine();

        ArrayList<ModelCad> lista = new ArrayList<>();

        for (int i = 0; i < quantidade; i ++){
            ModelCad cadastro = new ModelCad();
        
            System.out.printf("Nome: ");
            cadastro.nome = input.nextLine();

            System.out.printf("Classe: ");
            cadastro.classe = input.nextLine();

            System.out.printf("Raça: ");
            cadastro.raca = input.nextLine();


            lista.add(cadastro);
        }

        System.out.println("\nLendas:");
        for (ModelCad cad : lista){

            System.out.println("Lenda: " + cad.nome);
            System.out.println("Classe: " + cad.classe);
            System.out.println("Raça: " + cad.raca);
        }
        input.close();
    }
}