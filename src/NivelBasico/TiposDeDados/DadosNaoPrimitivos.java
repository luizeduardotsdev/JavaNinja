package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados nao primitivos: String, Class, Array, enum
        * Objetivo: Criar um ninja e atribuir metodos a ele.
        * */

        String name = "Naruto Uzumaki";
        String nameUpperCase = name.toUpperCase();

        System.out.println("name = " + nameUpperCase);
        System.out.println(name);

        String aldeia = "FOLHA";
        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println("aldeiaLowerCase = " + aldeiaLowerCase);

    }
}
