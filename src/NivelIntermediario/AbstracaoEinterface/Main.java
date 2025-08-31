package NivelIntermediario.AbstracaoEinterface;

public class Main {
    public static void main(String[] args) {
        Uzumaki ninja = new Uzumaki();
        ninja.nomeDoNinja();

        Uchiha ninja2 = new Uchiha();
        ninja2.nome = "Sassuke";
        ninja2.aldeia = "folha";
        ninja2.idade = 20;
        ninja2.nomeDoNinja();
    }
}
