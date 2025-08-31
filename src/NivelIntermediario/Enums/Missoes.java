package NivelIntermediario.Enums;

public class Missoes {

    private String nome;
    private RankDeMissoes rank;

    public void exibirDetalhes() {
        System.out.println("Missao: " + nome +  " - " + rank + " Descricao da missao: " + rank.getDescricao() + " dificuldade: " + rank.getDificuldade());
    }

    public Missoes() {
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
