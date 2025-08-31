package NivelIntermediario.HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        // obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke uchuha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 20;
        sasuke.sharinganAtivado();

        // obj hatake
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi";
        kakashi.aldeia = "Aldeia da folha";
        kakashi.idade = 30;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.NinjaDeElite();
    }
}
