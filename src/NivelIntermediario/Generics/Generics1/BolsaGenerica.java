package NivelIntermediario.Generics.Generics1;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {

    private List<T> equipamento;

    public BolsaGenerica() {
        this.equipamento = new ArrayList<>();

    }

    public BolsaGenerica(List<T> equipamento) {
        this.equipamento = new ArrayList<>();
    }

    // Colocar Equipamentos
    public void addEquipamento(T equipamento) {
        this.equipamento.add(equipamento);
    }

    public List<T> getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(List<T> equipamento) {
        this.equipamento = equipamento;
    }

    @Override
    public String toString() {
        return "BolsaGenerica: " + equipamento;
    }
}
