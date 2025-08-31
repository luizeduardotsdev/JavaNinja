package NivelIntermediario.Enums;

public class Main {
    public static void main(String[] args) {
        Missoes missao = new Missoes("Resgatar cachorro", RankDeMissoes.D);
        missao.exibirDetalhes();

        Missoes miissao2 = new Missoes("Matar o Pain", RankDeMissoes.S);
        miissao2.exibirDetalhes();
    }
}
