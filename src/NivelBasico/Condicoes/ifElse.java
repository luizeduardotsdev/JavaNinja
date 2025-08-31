package NivelBasico.Condicoes;

public class ifElse {
    public static void main(String[] args) {

        /*
        * objective: pass the level according to the number of missions
        * */
        String name = "Naruto";
        String rank;

        int age = 20;
        boolean hokage = false;
        short missionsNumber = 20;

        /*
        * if (condiçao) { resultado}
        * else if (condiçao) {resultado}
        * else {resultado}
        * */

        if (missionsNumber >= 20) {
            System.out.println("Rank: jounin");
        } else if (missionsNumber >= 10 && age >= 18) {
            System.out.println("Rank: Chunnin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
