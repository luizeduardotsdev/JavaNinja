package NivelIntermediario.HerancaMultipla;

// Herança multipla com interface
public class Hatake extends Ninja implements SharinganInterfarce, AnbuInterface {

    public void boasVindas(){
        System.out.println(nome + " Eu sou um Hatake");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " Sharingan ativado");
    }

    @Override
    public void NinjaDeElite() {
        System.out.println("Eu sou um ninja anbu de elite");
    }
}
