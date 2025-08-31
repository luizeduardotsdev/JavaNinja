package NivelIntermediario.AbstracaoEinterface;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;

    // metodos abstratos

    public abstract void nomeDoNinja();

    // metodos gerais

    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e estou usando a habilidade especial ");
    }
}
