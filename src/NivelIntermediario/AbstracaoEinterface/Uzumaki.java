package NivelIntermediario.AbstracaoEinterface;

public class Uzumaki extends Ninja implements NinjaInterface {

    public void nomeDoNinja() {
        System.out.println("meu nome é " + nome);
    }

    // sobreescrever o metodo da classe ninja
    @Override
    public void tacarShuriken() {
        System.out.println("tacou uma shuriken!");
    }
}
