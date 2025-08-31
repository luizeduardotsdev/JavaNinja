package NivelIntermediario.Overload.Sobrecarga;

public class Main {
    public static void main(String[] args) {

        //obj uzumaki
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da folha", 18, 20, RankNinja.JOUNNIN, Biju.Kurama);
        System.out.println(naruto.getBijus());
        naruto.estrategiaDeBatalha();
        naruto.habilidadeEspecial();

        //obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 19;
        sasuke.estrategiaDeBatalha();
        sasuke.habilidadeEspecial();

        //obj uchiha 2
        Uchiha itachi = new Uchiha("itachi", "aldeia da folha", 20);
        itachi.habilidadeEspecial();

        // obj uchiha 3
        Uchiha madara = new Uchiha("Madara", "aldeia da folha", 30, 900, RankNinja.HOKAGE);
        madara.habilidadeEspecial();
        madara.inteligenciaDeCombate(300);

        // obj final
        Anbu anbu = new Anbu();
        anbu.nome = "Ninja";
        System.out.println(anbu.nome);
    }
}
