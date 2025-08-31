package NivelIntermediario.PolimorfismoEabstracao;

public abstract class Ninja implements EstrategiaNinja {
    String nome;
    String aldeia;
    int idade;

    // Constructor
    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // metodos gerais, todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("meu nome é " + nome + " e eu usei minha habilidade especial");
    }


    // sobreescrevendo o metodo da interface
    @Override
    public void estrategiaNinja() {
        System.out.println("Essa é a minha estrategia ninja");
    }
}
