package NivelIntermediario.Desafios.Desafio4;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    String habilidade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformarcoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("habilidade normal: " + this.habilidade);
        }

    @Override
    public void executarHabilidadeBasica() {
        System.out.println("Executando a habilidade normal");
    }
}
