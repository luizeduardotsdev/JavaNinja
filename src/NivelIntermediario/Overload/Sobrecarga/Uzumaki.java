package NivelIntermediario.Overload.Sobrecarga;

public class Uzumaki extends Ninja{

    private Biju biju;

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDemissoesConcluidas, RankNinja rankNinja) {
        super(nome, aldeia, idade, numeroDemissoesConcluidas, rankNinja);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDemissoesConcluidas, RankNinja rankNinja, Biju biju) {
        super(nome, aldeia, idade, numeroDemissoesConcluidas, rankNinja);
        this.biju = biju;
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

    public Biju getBijus() {
        return biju;
    }

    public void setBijus(Biju biju) {
        this.biju = biju;
    }
}
