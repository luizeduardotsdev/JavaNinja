package NivelIntermediario.Overload.Sobrecarga;

public class Uchiha extends Ninja{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDemissoesConcluidas, RankNinja rankNinja) {
        super(nome, aldeia, idade, numeroDemissoesConcluidas, rankNinja);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " E esse é meu ataque especial de fogo. eu ja completei " +numeroDemissoesConcluidas + " e meu rank ninja é " + rankNinja);

    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Estou usando minha inteligencia de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Voce é um genio");
        } else if (qi >= 130) {
            System.out.println("Voce é um ninja promissor");
        } else {
            System.out.println("Voce precisa treinar");
        }
    }

}
