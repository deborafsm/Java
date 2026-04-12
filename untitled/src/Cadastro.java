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

    }
}
