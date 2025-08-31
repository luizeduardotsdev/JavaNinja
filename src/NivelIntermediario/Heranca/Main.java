package NivelIntermediario.Heranca;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        // objeto 1
        Naruto.nome = "Naruto";
        Naruto.idade = 17;
        Naruto.aldeia = " aldeia da Folha";
        Naruto.ModoSabio();

        // objeto 2;

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke";
        Sasuke.idade = 18;
        Sasuke.aldeia = " aldeia da Folha";
        Sasuke.SharinganAtivido();

        // objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura";
        Sakura.idade = 16;
        Sakura.aldeia = "aldeia da Folha";
        Sakura.ModoCura();

        // objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata";
        Hinata.idade = 16;
        Hinata.aldeia = "aldeia da Folha";
        Hinata.ByakuganAtivado();

        // objeto 5 com interface
        Boruto boruto = new Boruto();
        boruto.nome = "Boruto hyuga uzumaki";
        boruto.idade = 10;
        boruto.aldeia = "aldeia da Folha";
        boruto.ModoSabio();
        boruto.ativarOKarma();
        boruto.ativarJougan();

    }
}
