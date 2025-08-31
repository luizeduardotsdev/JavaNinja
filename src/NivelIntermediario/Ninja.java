package NivelIntermediario;

public class Ninja {
    String name;
    int age;
    String aldeia;

    // metodo publico/*
    //
    // o metodo void nao retorna nenhum valor
    // */
    public void SharinganAtivado() {
        System.out.println("Sharingan Ativado");
    }

    public String EuSouUmNinja() {
        return "Eu sou um ninja";
    }

    public int AnosParaHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - age;
    }
}
