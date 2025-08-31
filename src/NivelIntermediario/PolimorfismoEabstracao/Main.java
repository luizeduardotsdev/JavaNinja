package NivelIntermediario.PolimorfismoEabstracao;

public class Main {
    public static void main(String[] args) {
        Uzumaki uzumaki = new Uzumaki();
        uzumaki.nome = "Naruto Uzumaki";
        uzumaki.habilidadeEspecial();
        uzumaki.estrategiaNinja();


        Uchiha uchiha = new Uchiha();
        uchiha.nome = "Sassuke Uchiha";
        uchiha.habilidadeEspecial();
        uchiha.estrategiaNinja();


        Uchiha itachi = new Uchiha("Itachi", "Aldeia da folha", 24 );
        itachi.habilidadeEspecial();

    }
}
