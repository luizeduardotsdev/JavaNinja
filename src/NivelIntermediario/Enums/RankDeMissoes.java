package NivelIntermediario.Enums;

public enum RankDeMissoes {

    D("Iniciante", 1),
    C("Baixo", 3),
    B("Medio", 5),
    A("Dificil", 7),
    S("Muito dificil", 10);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
