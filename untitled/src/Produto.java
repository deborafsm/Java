public class Produto {
    String nome;

    public static void main(String[] args) {
        // Criação do objeto (instanciando a própria classe Produto)
        Produto para = new Produto();

        // Atribuindo o valor ao atributo
        para.nome = "Teclado";

        System.out.println("Produto: " + para.nome);
    }
}