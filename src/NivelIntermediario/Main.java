package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Criar Hashirama naruto
        String name = "Hashirama";
        int age = 19;
        String aldeia = "Folha";

        /*System.out.println(name);
        System.out.println(age);
        System.out.println(aldeia);
*/
        // Criar ninja obito - objeto

        Ninja Obito = new Ninja();
        Obito.name = "Obito";
        Obito.age = 19;
        Obito.aldeia = "Folha";

//        System.out.println(Obito.name);
        Obito.SharinganAtivado();
        String chamandoMetodo = Obito.EuSouUmNinja();
        System.out.println(chamandoMetodo);

        int idade = Obito.AnosParaHokage(70);

        System.out.println(Obito.name + " tem " + Obito.age + " anos e falta " + idade +" anos para ser hokage");
        // Criar ninja shisui - objeto

        Ninja Shisui = new Ninja();
        Shisui.name = "Shisui";
        Shisui.age = 20;
        Shisui.aldeia = "Folha";
//        System.out.println(Shisui.name);



    }
}
