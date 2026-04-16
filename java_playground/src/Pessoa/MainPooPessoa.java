package Pessoa;

import java.util.Scanner;

public class MainPooPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //PERGUNTA QNTAS VEZES QUER QUE CADASTRE
        System.out.print("Quantas pessoas deseja cadastrar? ");
        //GUARDA ESSA INFORMAÇÃO NO QUANTIDADE
        int quantidade = sc.nextInt();
        // limpa o ENTER que sobrou do nextInt()
        sc.nextLine();
        //FAZ O FOR CONTANDO ATÉ CHEGAR NA QNTIDADE
        for (int i = 0; i < quantidade; i++) {
//SO MOSTRA A FRASE E QUE PESSOA QUE É PESSOA 1, PESSOA 2 ....
            System.out.println("\nPessoa " + (i + 1));
//INICIA O OBJETO, TODA PESSOA VAI SER PESSOA..
            PooPessoa pessoa = new PooPessoa();
//PERGUNTA O NOME, GUARDA O NOME NA VARIAVEL NOME
            System.out.print("Digite seu nome: ");
            pessoa.nome = sc.nextLine();
//PERGUNTA IDADE, GUARDA IDADE NA VARIAVEL IDADE
            System.out.print("Digite sua idade: ");
            pessoa.idade = sc.nextInt();
            //NÃO SEI MUITO BEM O QUE EÉ BUFFER..
            sc.nextLine(); // limpa buffer
//APESENTA E VERIFICARMAIORIDADE SÃO FUNÇÕES;
            pessoa.apresentar();
            pessoa.verificaMaiorIdade();
        }

        System.out.println("\nCadastro finalizado!");
        sc.close();
    }
}