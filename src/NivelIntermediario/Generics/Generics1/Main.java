package NivelIntermediario.Generics.Generics1;

public class Main {
    public static void main(String[] args) {
        EquipamentoNinja eq = new EquipamentoNinja("Kunai de ferro");
        EquipamentoNinja eq1 = new EquipamentoNinja("Shuriken");
        EquipamentoNinja eq2 = new EquipamentoNinja("Pergaminho");

        BolsaGenerica<EquipamentoNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.addEquipamento(eq);
        bolsaGenerica.addEquipamento(eq1);
        bolsaGenerica.addEquipamento(eq2);
        System.out.println(bolsaGenerica);
    }
}
