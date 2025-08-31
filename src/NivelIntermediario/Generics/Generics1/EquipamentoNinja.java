package NivelIntermediario.Generics.Generics1;

public class EquipamentoNinja {
    private String nome;

    public EquipamentoNinja() {
    }

    public EquipamentoNinja(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "EquipamentoNinja: " + nome;
    }
}
