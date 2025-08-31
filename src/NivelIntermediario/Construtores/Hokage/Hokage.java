package NivelIntermediario.Construtores.Hokage;

public abstract class Hokage {
    String nome;
    int idade;
    boolean vivoOuNao;
    String Aldeia;
    double salario;
    int missoes;
    double altura;

    public Hokage() {
        // NoArgsConstructor
    }

    public Hokage(String nome) {
        this.nome = nome;
    }

    public Hokage(int idade) {
        this.idade = idade;
    }

    // AllArgsConstructor
    public Hokage(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    // Alt + insert para criar construtores
    public Hokage(String nome, int idade, boolean vivoOuNao, String aldeia, double salario, int missoes, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        Aldeia = aldeia;
        this.salario = salario;
        this.missoes = missoes;
        this.altura = altura;
    }

    public abstract void sabedoriaHokage();
}
