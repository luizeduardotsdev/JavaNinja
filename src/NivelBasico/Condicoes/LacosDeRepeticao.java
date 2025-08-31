package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de repetiçao: Vao repetir infinitamente ate atingir o parametro desejado
        *
        *
        * */

        int numeroClones = 0;
        int numeroMaximoClones = 40;

      /*  while (numeroClones <= numeroMaximoClones) {
            System.out.println("Clone das Sombras de numero: " + numeroClones);
            numeroClones++;
        }*/

        for (int i = 0; i <= numeroMaximoClones; i++) {
            System.out.println("Clone das Sombras de numero: " + i);
        }

    }
}
