package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternarios sao maneira de reduzir o codigo
        * variavel (codicao) ? valorSeVerdadeiro : valorSeFalso
        * */

        short numeroMissioes = 11;

        String nivel = (numeroMissioes >= 10) ? "Esse Ninja esta com mais de 10 missoes" : "Esse Ninja tem menos de 10 missoes";
        System.out.println(nivel);

    }
}
