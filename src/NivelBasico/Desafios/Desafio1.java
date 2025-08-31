package NivelBasico.Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        // Ninja 1
        String nameNinja1 = "Naruto";
        int age1 = 14;
        String nameMission1 = "Deter Bandido";
        char missionDificulty1 = 'C';
        String missionStatus1 = "Em andamento";

        if (age1 < 15) {
            if (missionDificulty1 == 'C' || missionDificulty1 == 'D') {
                missionStatus1 = "Concluida";
            } else {
                missionStatus1 = "Nao concluida";
            }
        } else {
            missionStatus1 = "Nao concluida";
        }

        System.out.println("-----------------------");
        System.out.println("O nome do nija é: " +  nameNinja1 + " e possui " + age1 + " anos.");
        System.out.println("Sua missao é: " + nameMission1 + " com dificuldade de letra: " + missionDificulty1 + " com os status de " + missionStatus1 );

        // Ninja 2
        String nameNinja2 = "Sasuke";
        int age2 = 14;
        String nameMission2 = "Deter Bandido";
        char missionDificulty2 = 'C';
        String missionStatus2 = "Em andamento";

        if (age2 < 15) {
            if (missionDificulty2 == 'C' || missionDificulty2 == 'D') {
                missionStatus2 = "Concluida";
            } else {
                missionStatus2 = "Nao concluida";
            }
        } else {
            missionStatus2 = "Nao concluida";
        }

        System.out.println("-----------------------");
        System.out.println("O nome do nija é: " +  nameNinja2 + " e possui " + age2 + " anos.");
        System.out.println("Sua missao é: " + nameMission2 + " com dificuldade de letra: " + missionDificulty2 + " com os status de " + missionStatus2 );

        // Ninja 3
        String nameNinja3 = "Sakura";
        int age3 = 20;
        String nameMission3 = "Deter Bandido";
        char missionDificulty3 = 'C';
        String missionStatus3 = "Em andamento";

        if (age3 < 15) {
            if (missionDificulty3 == 'D' || missionDificulty3 == 'D') {
                missionStatus3 = "Concluida";
            } else {
                missionStatus3 = "Nao concluida";
            }
        } else {
            missionStatus3 = "Nao concluida";
        }

        System.out.println("------------------------");
        System.out.println("O nome do nija é: " +  nameNinja3 + " e possui " + age3 + " anos.");
        System.out.println("Sua missao é: " + nameMission3 + " com dificuldade de letra: " + missionDificulty3 + " com os status de " + missionStatus3 );

    }
}
