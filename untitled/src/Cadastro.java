public class Cadastro {
    String nome;
    String classe;
    String raca;

    public static void main(String[] args) {
        Cadastro cadastro1 = new Cadastro();

        cadastro1.nome = "Drizzt d'Urden";
        cadastro1.classe = "Ranger";
        cadastro1.raca= "Drow";

        System.out.println("Lenda: "+cadastro1.nome+" Classe: "+cadastro1.classe+" Raça: "+cadastro1.raca);

        Cadastro cadastro2 = new Cadastro();
        cadastro2.nome = "Zaknafein d'Urden";
        cadastro2.classe = "Espadachin";
        cadastro2.raca = "Drow";

        System.out.println("Lenda: "+cadastro2.nome+" Classe: "+cadastro2.classe+" Raça: "+cadastro2.raca);
    }
}
