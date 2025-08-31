package NivelBasico.Arrays;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        String[][] ninjasEaldeias = new String[3][3];
        ninjasEaldeias[0][0] = "Konoha";
        ninjasEaldeias[0][1] = "Naruto";
        ninjasEaldeias[0][2] = "Sakura";

        ninjasEaldeias[1][0] = "Areia";
        ninjasEaldeias[1][1] = "Gaara";
        ninjasEaldeias[1][2] = "Temari";

        ninjasEaldeias[2][0] = "Nevoa";
        ninjasEaldeias[2][1] = "Zabuza";
        ninjasEaldeias[2][2] = "Haku";

        for ( int i = 0; i < ninjasEaldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasEaldeias[i][0] + " Ninja 1: " + ninjasEaldeias[i][1] + " Ninja 2: " + ninjasEaldeias[i][2]);
        }
    }
}
