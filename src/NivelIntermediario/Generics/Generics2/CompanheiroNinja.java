package NivelIntermediario.Generics.Generics2;

public class CompanheiroNinja {
    private String nomeAnimal;

    public CompanheiroNinja(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    @Override
    public String toString() {
        return "CompanheiroNinja nomeAnimal=" + nomeAnimal;
    }
}
