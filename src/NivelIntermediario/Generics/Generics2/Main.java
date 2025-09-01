package NivelIntermediario.Generics.Generics2;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsa = new BolsaNinja<>();

        bolsa.adicionar(new Kunai("Kunai explosiva"));
        bolsa.adicionar(new Shuriken(12));
        bolsa.adicionar(new Pergaminho("invocacao do sapo"));
        bolsa.adicionar(new CompanheiroNinja("Sapo"));

        System.out.println("itens da bolsa ninja");
        bolsa.mostraFerramenta();

    }
}
