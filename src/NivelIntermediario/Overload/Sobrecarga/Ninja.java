package NivelIntermediario.Overload.Sobrecarga;

public class Ninja implements EstrrategiaDeBatalha {
    // TODO: incluir 2 novos atributos:
    String nome;
    String aldeia;
    int idade;
    int numeroDemissoesConcluidas;
    RankNinja rankNinja;
    final double altura = 2.10;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: Sobrecarga de construtor
    public Ninja(String nome, String aldeia, int idade, int numeroDemissoesConcluidas, RankNinja rankNinja) {
        this(nome, aldeia, idade);
        this.numeroDemissoesConcluidas = numeroDemissoesConcluidas;
        this.rankNinja = rankNinja;
    }

    public void habilidadeEspecial() {
        System.out.println("Estou usando minha habilidade especial");
    }

    // metodos

    final void tacarKunai() {
        System.out.println("METODO DA CLASSE MAE!");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Estou usando minha estrategia de batalha");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Estou usando minha inteligencia de combate");
    }

    // sobrecarga do metodo
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
