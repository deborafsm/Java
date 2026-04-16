package Pessoa;

public class PooPessoa {
    String nome;
    int idade;

    void apresentar(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);

    }
    void verificaMaiorIdade(){
        if(idade > 18){
            System.out.println("Maior idade: "+idade);
        }else{
            System.out.println("Menor idade: "+idade);
        }
    }
}
