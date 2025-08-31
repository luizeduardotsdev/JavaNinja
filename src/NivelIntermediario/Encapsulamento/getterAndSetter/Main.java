package NivelIntermediario.Encapsulamento.getterAndSetter;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- Naruto Uzumaki ---------------");
        Uzumaki naruto = new Uzumaki("Naruto", "aldeia da folha", 20, 3, 2.00);
        System.out.println(naruto.getAltura());
        naruto.setNome("Naruto Uzumaki");
        System.out.println(naruto.getNome());


        System.out.println("--------------- Sasuke Uchiha ---------------");

    }
}
