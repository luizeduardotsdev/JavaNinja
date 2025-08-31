package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Uzumaki uzumaki = new Uzumaki();
        uzumaki.nome = "Naruto";
        uzumaki.aldeia = "aldeia da folha";
        uzumaki.idade = 18;
        uzumaki.habilidadeEspecial();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.habilidadeEspecial();

    }
}
