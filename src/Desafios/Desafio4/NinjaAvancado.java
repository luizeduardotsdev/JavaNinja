package Desafios.Desafio4;

public class NinjaAvancado extends NinjaBasico {

    String especialidade;


    public NinjaAvancado() {
        super();
    }

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    public void habilidadeEspecial() {
        System.out.println("Estou usando uma habilidade especial " + especialidade);
    }


}
