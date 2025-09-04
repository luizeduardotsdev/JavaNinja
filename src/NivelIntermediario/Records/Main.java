package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {
        Ninja cadastro = new Ninja("Naruto", "naruto@gmail.com", 999999999);
        System.out.println(cadastro);

        NinjaRecord cadastroRecord = new NinjaRecord("Sasuke", "sasuke@gmail.com", "111111111");
        System.out.println(cadastroRecord);
        System.out.println(cadastroRecord.emailCaixaAlta());
    }
}
