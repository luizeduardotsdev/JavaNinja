package NivelBasico.Arrays;

public class Array {
    public static void main(String[] args) {

        String[] ninja = new String[6] ;

        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";
        ninja[3] = "Kakashi";
        ninja[4] = "Hinata";

        // Redeclarar array

        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama";
        ninja[2] = "Hiruzen";
        ninja[3] = "Minato";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi";
        ninja[6] = "Naruto";
        System.out.println(ninja[0]);

        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

        // String inicializa como null
        System.out.println(ninja[4]);

        // inicializa como 0
        int[] idade = new int[2];
        idade[0] = 18;
        System.out.println(idade[1]);

        // inicializa como false
        boolean[] trueOrFalse = new boolean[1];
        System.out.println(trueOrFalse[0]);

        // inicializa com 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);


    }
}
